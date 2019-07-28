package util;

import java.sql.*;

public class Jdbc{
    private static Connection con=null;
    private static String Drivere="com.mysql.jdbc.Driver";
    private static String URL="jdbc:mysql://localhost:3306/staff";
    private  static String USER="root";
    private  static String PWD="1234";

    /**
     * 获取数据库连接
     * @return
     */
    public static Connection getCon(){
        try {
            Class.forName(Drivere);
            con= DriverManager.getConnection(URL,USER,PWD);
            return con;
        }catch (SQLException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 关闭mysql连接释放资源
     * @param con
     * @param pst
     * @param rs
     */
    public static void colseAll(Connection con, PreparedStatement pst, ResultSet rs){
        try {
            if(con != null)con.close();
            if(pst != null)pst.close();
            if(rs != null)rs.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
