package bean;

/**
 * 登录的用户信息
 */
public class User {
    private int userId;
    private String userName;
    private int userPwd;
    private String phone;
    private String root;

    public User(int userId, String userName, int userPwd, String phone, String root) {
        this.userId = userId;
        this.userName = userName;
        this.userPwd = userPwd;
        this.phone = phone;
        this.root = root;
    }

    public User() {
        super();
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(int userPwd) {
        this.userPwd = userPwd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }
}
