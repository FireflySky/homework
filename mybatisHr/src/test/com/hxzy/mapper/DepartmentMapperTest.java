package com.hxzy.mapper;

import com.hxzy.entity.Department;
import com.hxzy.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author yuanpeng
 * @date 2019-08-15 下午 2:18
 * @comment 请详细描述类的作用
 */
public class DepartmentMapperTest {

    @Test
    public void findAll() throws Exception {
        //1、取得SqlSession   以前Connection
        SqlSession session = MybatisUtil.getSession();
        //2、取得代理对象
        DepartmentMapper mapper = session.getMapper(DepartmentMapper.class);
        //3、查询所有的数据
        List<Department> arr = mapper.findAll();
        //4、关闭
        session.close();

        for (Department r : arr) {
            System.out.println(r.getId() + "," + r.getName() + "," + r.getStatus());
        }
    }
}