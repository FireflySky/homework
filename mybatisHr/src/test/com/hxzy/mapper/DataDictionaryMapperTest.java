package com.hxzy.mapper;

import com.hxzy.entity.DataDictionary;
import com.hxzy.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author yuanpeng
 * @date 2019-08-15 下午 1:12
 * @comment 请详细描述类的作用
 */
public class DataDictionaryMapperTest {
    @Test
    public void insert() throws Exception {
        //1、取得SqlSession   以前Connection
        SqlSession session= MybatisUtil.getSession();
        //2、取得代理对象
        DataDictionaryMapper mapper = session.getMapper(DataDictionaryMapper.class);

        System.out.println(mapper);

        //3、调用接口的方法
        DataDictionary dictionary=new DataDictionary();
        dictionary.setName("mybatis1");
        dictionary.setTypeId(2);
        dictionary.setStatus(1);

        int count=mapper.insert(dictionary);

        //4、提交事务
        session.commit();
        //5、关闭session，回收给连接池
        session.close();

    }

    @Test
    public void update() throws Exception {
    }

    @Test
    public void findOne() throws Exception {
    }

    @Test
    public void findAll() throws Exception {
        //1、取得SqlSession   以前Connection
        SqlSession  session= MybatisUtil.getSession();
        //2、取得代理对象
        DataDictionaryMapper  mapper=session.getMapper(DataDictionaryMapper.class);
        //3、查询所有的数据
//        List<DataDictionary> arr=mapper.findAll();
        //4、关闭
        session.close();


       /* for(DataDictionary r :arr){
            System.out.println(r.getId()+","+r.getName()+","+r.getTypeId()+", "+r.getStatus());
        }*/
    }

}