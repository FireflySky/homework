package view;

import bean.Staff;
import bean.User;
import impl.StaffDaoImpl;
import impl.UserDaoImpl;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 前端界面
 */
public class MainView {
    private static Scanner sc=null;
    private static UserDaoImpl useri=null;
    private static StaffDaoImpl staff=null;
    private static User loginUser=null;//当前登录的用户
    static {
        sc=new Scanner(System.in);
        loginUser=new User();
        useri=new UserDaoImpl();
        staff=new StaffDaoImpl();
    }
    //入口界面
    public void loginMain(){
        System.out.println("************员工管理系统***********\t");
        while (true) {
            System.out.println("请选择：1.登录 2.注册 3.退出");
            String key = sc.next();
            switch (key){
                case "1":
                    if(login())mainFram();
                    break;
                case "2":
                    if(register()){
                       if( login())mainFram();
                    }
                    break;
                case "3":
                    System.out.println("感谢使用");
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        }
    }

    //主功能界面
    private void mainFram(){
        if(loginUser.getRoot().equals("root")){
            System.out.println("欢迎你：" + loginUser.getUserName()+" 管理员");
        }else {
            System.out.println("欢迎你：" + loginUser.getUserName());
        }
        while (true){
            System.out.println("你想要：1.查询人员信息 2.添加人员 3.修改人员信息 3.删除人员 4.退出登录");
            String key=sc.next();
            switch (key){
                case "1":
                    query();
                    break;
                case "2":break;
                case "3":break;
                case "4":
                    return;
                default:
                    System.out.println("输入有误");
                    break;
            }
        }

    }

    //登录
    private boolean login(){
        for (int i=0;i<3;i++) {
            System.out.println("请输入用户名：");
            String name = sc.next();
            System.out.println("请输入密码");
            int pwd = sc.nextInt();
            User user=useri.queryById(name);
            if(user != null){
                if (pwd == user.getUserPwd()) {
                    System.out.println("验证成功，正在登录");
                    loginUser.setUserName(name);
                    loginUser.setUserId(user.getUserId());
                    loginUser.setRoot(user.getRoot());
                    return true;
                }else{
                    System.out.println("密码输入有误");
                }
            }else{
                System.out.println("该用户不存在");
            }
        }
        System.out.println("连续输错3次，返回主界面");
        return false;
    }
    //注册
    private boolean register(){
        for (int i=0;i<3;i++) {
            System.out.println("请输入用户名：");
            String name = sc.next();
            System.out.println("请输入密码");
            int pwd = sc.nextInt();
            System.out.println("请输入手机号");
            String phone=sc.next();
            User user=useri.queryById(name);
            if(phone.length() !=11){
                System.out.println("手机号码有误");
            }else{
                if(user == null){
                    User u=new  User(0,name,pwd,phone,new String("user"));
                    if(useri.add(u)){
                            System.out.println("注册成功,跳转登录界面");
                            return true;
                    }else{
                        System.out.println("注册失败");
                    }
                }else{
                    System.out.println("该用户已经存在");
                }
                };
        }
        System.out.println("连续失败3次，返回主界面");
        return false;
    }
    private void query(){
        ArrayList<Staff> arr= staff.queryAll();
        if(null==arr || arr.size()==0){
            System.out.println("暂无数据");
            return;
        }
        System.out.println("姓名\t性别\t年龄");
        for (Staff sta:arr) {
            System.out.println(sta.getStaName()+"\t"+sta.getStaSex()+"\t"+sta.getStaAge());
        }
    }
}
