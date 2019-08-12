package com.hxzy.dao.impl;

import com.hxzy.common.util.JDBCUtil;
import com.hxzy.common.vo.PageResult;
import com.hxzy.common.vo.PageSearchVO;
import com.hxzy.dao.DatadDao;
import com.hxzy.entity.Datad;
import com.hxzy.vo.RoleSearchVO;
import org.apache.commons.lang3.StringUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DatadDaoImpl implements DatadDao {
    LinkedList<Object> paramValues=null;
    StringBuffer sql=null;
    List<Datad> arrList=null;
    PreparedStatement prep=null;
    String sqlCount=null;
    Connection conn=null;
    ResultSet rst=null;
    //总记录数
    int totals=0;

    @Override
    public PageResult<Datad> searchPaging(PageSearchVO pageSearchVO) {
        RoleSearchVO searchVO=(RoleSearchVO) pageSearchVO;

        sql =new StringBuffer("select * from  datadictionary where 1=1  and status=1 ");
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
        sqlCount= JDBCUtil.getCountSql(sql.toString());

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
        PageResult<Datad>  pageResult=new PageResult<Datad>();
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
                Datad role = new Datad();
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
    public int insert(Datad obj) {
        return 0;
    }

    @Override
    public int update(Datad obj) {
        return 0;
    }

    @Override
    public Datad findOne(int id) {
        return null;
    }
}
