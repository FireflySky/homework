package impl;

import bean.User;
import dao.UserDao;
import util.SqlQuery;
import util.SqlUpdate;

import java.sql.ResultSet;
import java.util.ArrayList;

public class UserDaoImpl implements UserDao {
    /**
     * 查询用户登录信息
     * @return
     */
    public ArrayList<User> queryAll() {
        String sql="select * from user";
        return SqlQuery.query(new User(),sql,new Object[]{});
    }
    /**
     * 根据id查询用户登录信息
     * @return
     */
    @Override
    public User queryById(String name) {
        String sql="select * from user where userName=?";
        ArrayList<User> arr=SqlQuery.query(new User(),sql,new Object[]{name});
       if(arr.size()>0)return arr.get(0);
       return null;
    }

    /**
     * 添加用户登录信息
     * @return
     */
    public boolean add(User user) {
        String sql="insert into user values(?,?,?,?,?)";
        return SqlUpdate.update(sql,new Object[]{null,user.getUserName(),user.getUserPwd(),user.getPhone(),user.getRoot()});
    }
    /**
     * 删除用户登录信息
     * @return
     */
    public boolean remove(String userId) {
        String sql="delete from user where userID=?";
        return SqlUpdate.update(sql,userId);
    }
    /**
     * 修改用户登录信息
     * @return
     */
    public boolean update(User user) {
        String sql="update user set userName=?,userPwd=?,phone=?,root=? where userID=?";
        return SqlUpdate.update(sql,new Object[]{"default",user.getUserName(),user.getUserPwd(),user.getPhone(),user.getRoot()});
    }
}
