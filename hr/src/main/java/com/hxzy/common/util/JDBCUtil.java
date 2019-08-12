package com.hxzy.common.util;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author wy
 * @date 2019-08-12 16:54
 * @comment 本地线程池和数据库连接池
 */
@Slf4j
public class JDBCUtil {

    /**
     * 4、定义一个本地线程池
     */
    private ThreadLocal<Connection>  threadLocal=new ThreadLocal<Connection>();


    /**
     * 5、定义druid连接池对象
     */
    private DruidDataSource  dataSource=null;

    /**
     * 2、自已实例化变化
     */
    private static JDBCUtil  jdbcUtil=new JDBCUtil();

    /**
     * 1、私有的构造方法(不让别人去new)
     */
    private JDBCUtil(){
        //读取 jdbc.properties       HashTable

        Properties  prop=new Properties();
        try {
            prop.load(this.getClass().getResourceAsStream("/jdbc.properties"));
            dataSource=new DruidDataSource();
            dataSource.setUrl( prop.getProperty("jdbc.url"));
            dataSource.setDriverClassName(prop.getProperty("jdbc.driver"));
            dataSource.setUsername(prop.getProperty("jdbc.username"));
            dataSource.setPassword(prop.getProperty("jdbc.password"));
        } catch (IOException e) {
            log.error(e.getMessage());
            e.printStackTrace();
        }

    }

    /**
     * 3、返回自己的实例
     * @return
     */
    public static JDBCUtil getJdbcUtil() {
        return jdbcUtil;
    }


    /**
     * 得到数据库连接
     * @return
     */
    public Connection  getConnection(){
      //1、本地线程池中判断是否有连接
        Connection  conn=this.threadLocal.get();
        if(conn==null){
            try {
                //2、从本地数据库连接 druid 池中取
                conn=this.dataSource.getConnection();
                //3、存放到本地线程池中
                this.threadLocal.set(conn);
            } catch (SQLException e) {
                log.error(e.getMessage());
                e.printStackTrace();
            }
        }
        return conn;
    }

    /**
     * 回收数据库连接
     */
    public void close(){
        //1、本地线程池中判断是否有连接
        Connection  conn=this.threadLocal.get();
        if(conn!=null){
            try {
                //关闭数据库(还给druid连接池)
                conn.close();
                //从本地线程池中移掉
                this.threadLocal.remove();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * 根据普通查询语句生成count(*)语句
     * @param sql
     * @return
     */
    public static String getCountSql(String sql){
        String temp=sql.toUpperCase();
        int startIndex=temp.indexOf("FROM");
        int endIndex=temp.lastIndexOf("LIMIT");

        temp=temp.substring(startIndex, endIndex);

        return "select count(*) "+ temp;
    }

}
