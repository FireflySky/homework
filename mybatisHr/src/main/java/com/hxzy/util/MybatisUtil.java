package com.hxzy.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author wy
 * @date 2019-08-15 10:01
 * @comment 全局唯一的SqlSessionFactory
 */
public class MybatisUtil {
    private static SqlSessionFactory  sqlSessionFactory;
    static{
        InputStream inputStream = null;
        try {
            //  l第一种根据根目录查找文件，第二种根据当前文件查找配置文件
            //  inputStream=MybatisUtil.class.getResourceAsStream("/mybatis-config.xml");
            inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * 取得SqlSession(事务要自己手动提交)
     * @return
     */
    public static SqlSession  getSession(){
        return sqlSessionFactory.openSession();
    }
}
