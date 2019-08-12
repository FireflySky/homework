package com.hxzy.dao.impl;

import com.hxzy.common.util.JDBCUtil;
import com.hxzy.common.vo.PageResult;
import com.hxzy.common.vo.PageSearchVO;
import com.hxzy.dao.RoleDao;
import com.hxzy.entity.Role;
import com.hxzy.vo.RoleSearchVO;
import org.apache.commons.lang3.StringUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author wy
 * @date 2019-08-12 17:20
 * @comment 角色数据访问实现类
 */
public class RoleDaoImpl  implements RoleDao{

    LinkedList<Object> paramValues=null;
    StringBuffer sql=null;
    List<Role> arrList=null;
    PreparedStatement  prep=null;
    String sqlCount=null;
    Connection conn=null;
    ResultSet rst=null;
    //总记录数
    int totals=0;

    @Override
    public PageResult<Role> searchPaging(PageSearchVO pageSearchVO) {

        RoleSearchVO  searchVO=(RoleSearchVO) pageSearchVO;

        sql =new StringBuffer("select * from  role where 1=1  and status=1 ");
        paramValues =new LinkedList<>();
        /**
         * 如果名称不为空
         */
        if(StringUtils.isNoneBlank(searchVO.getName())){
            sql.append(" and  name like ? ");
            paramValues.add("%"+ searchVO.getName()+"%");
        }
        //分页操作
        sql.append(" limit ?,?");
        paramValues.add(searchVO.getOffset());
        paramValues.add(searchVO.getLimit());

        //得到count(*)语句
        sqlCount=JDBCUtil.getCountSql(sql.toString());

        //执行操作
        conn=JDBCUtil.getJdbcUtil().getConnection();


        //总记录数
        arrList=new ArrayList<>();

        try {
            //1、查询 分页的对象
            prep=conn.prepareStatement(sql.toString());
            filter("");
            paramValues.removeLast();
            paramValues.removeLast();

            //2、查询总记录数
            prep=conn.prepareStatement(sqlCount);
            filter("count");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //返回对象
        PageResult<Role>  pageResult=new PageResult<Role>();
        pageResult.setTotals(totals);
        pageResult.setData(arrList);
        return pageResult;
    }


    private void filter(String tag) throws SQLException {
        for (int i = 0; i < paramValues.size(); i++) {
            prep.setObject(i + 1, paramValues.get(i));
        }
        rst = prep.executeQuery();
        if(tag.equals("count")) {
            while(rst.next()){
                totals=rst.getInt(1);
            }
        }else{
            while (rst.next()) {
                Role role = new Role();
                role.setId(rst.getInt("id"));
                role.setName(rst.getString("name"));
                role.setStatus(rst.getInt("status"));
                arrList.add(role);
            }

        }
        rst.close();
        prep.close();
    }

    @Override
    public int insert(Role obj) {
        int count=0;

        PreparedStatement prep=null;
        String sql="insert into role(name,status) values(?,?)";
        try {
            prep=JDBCUtil.getJdbcUtil().getConnection().prepareStatement(sql);
            prep.setString(1, obj.getName());
            prep.setInt(2,obj.getStatus());
            count=prep.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            if(prep!=null){
                try {
                    prep.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return count;
    }

    @Override
    public int update(Role obj) {
        int count=0;
        PreparedStatement prep=null;
        String sql="update role set name=?,status=? where id=?";
        try {
            prep=JDBCUtil.getJdbcUtil().getConnection().prepareStatement(sql);
            prep.setString(1, obj.getName());
            prep.setInt(2,obj.getStatus());
            prep.setInt(3,obj.getId());
            count=prep.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            if(prep!=null){
                try {
                    prep.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return count;
    }

    @Override
    public Role findOne(int id) {
        Role role=null;

        PreparedStatement prep=null;
        ResultSet rst=null;
        String sql="select * from role  where id=?";
        try {
            prep=JDBCUtil.getJdbcUtil().getConnection().prepareStatement(sql);
            prep.setInt(1,id);

            //循环取值
            rst=prep.executeQuery();
            while(rst.next()){
                role=new Role();
                role.setId(rst.getInt("id"));
                role.setName(rst.getString("name"));
                role.setStatus(rst.getInt("status"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try{
                if(rst!=null){
                    rst.close();
                }
                if(prep!=null){
                    prep.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }

        }
        return role;
    }
}
