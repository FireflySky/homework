package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SqlUpdate {
    private static Connection con=null;
    private static PreparedStatement pst=null;
    /**
     * 修改数据库信息
     */
    public static boolean update(String sql,Object...obj){
        con=Jdbc.getCon();
        try {
            pst=con.prepareStatement(sql);
            for(int i=0;i<obj.length;i++) {
                pst.setObject(i+1,obj[i]);
            }
            int s=pst.executeUpdate();
            if(s>0)return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            Jdbc.colseAll(con,pst,null);
        }
        return false;
    }
}

