package util;

import bean.Leave;
import bean.Staff;
import bean.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * 查询数据库信息
 */
public class SqlQuery {
    private static Connection con=null;
    private static PreparedStatement pst=null;
    private static ResultSet rs=null;
    public static ArrayList query(Object claz,String sql,Object...obj){
        con=Jdbc.getCon();
        ArrayList arr=new ArrayList();
        try {
            pst=con.prepareStatement(sql);
            for (int i = 0; i <obj.length ; i++) {
                pst.setObject(i+1,obj[i]);
            }
            rs=pst.executeQuery();
            if(claz instanceof User){
                while (rs.next()){
                   arr.add(new User(rs.getInt(1),rs.getString(2),rs.getInt(3),
                           rs.getString(4),rs.getString(5)));
                }
            }
            if(claz instanceof Staff){
                while (rs.next()){
                    arr.add(new Staff(rs.getInt(1),rs.getString(2),rs.getString(3),
                            rs.getInt(4),rs.getString(5),rs.getString(6),rs.getString(7),
                            rs.getString(8),rs.getString(9),rs.getInt(10)));
                }
            }
            if(claz instanceof Leave){
                while (rs.next()){
                    arr.add(new Leave(rs.getInt(1),rs.getString(2),rs.getString(3)));
                }
            }
            return arr;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            Jdbc.colseAll(con,pst,rs);
        }
        return null;
    }
}
