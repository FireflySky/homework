package com.hxzy.mapper;

import com.hxzy.entity.Staff;
import com.hxzy.util.MybatisUtil;
import com.hxzy.vo.StaffVO;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author yuanpeng
 * @date 2019-08-16 下午 3:55
 * @comment 请详细描述类的作用
 */
public class StaffMapperTest {

    @Test
    public void search() throws Exception {
        //1、取得SqlSession   以前Connection
        SqlSession session= MybatisUtil.getSession();
        //2、取得代理对象
        StaffMapper  mapper=session.getMapper(StaffMapper.class);
        //3、查询所有的数据
        //查询条件
        StaffVO search=new StaffVO();
//        search.setOffset(1);
//        search.setLimit(2);
//        search.setName("%小%");
        List<Staff> arr=mapper.search(search);

        //4、关闭
        session.close();


        for(Staff r :arr){
            System.out.println(r.toString());
        }

    }
    @Test
    public void insert(){
        //1、取得SqlSession   以前Connection
        SqlSession session= MybatisUtil.getSession();
        //2、取得代理对象
        StaffMapper  mapper=session.getMapper(StaffMapper.class);
        //3、查询所有的数据
        //查询条件
        Staff staff=new Staff();
        staff.setName("小明");
        staff.setEname("xiaoming");
        staff.setSex("男");
        staff.setBorthday(new Date());
        staff.setPolitic(12);
        staff.setDepartment(33);
        staff.setCompany(4);
        staff.setJobs(29);
        staff.setNation(26);
        staff.setMarriage(9);
        staff.setNativee("南京");
        staff.setIdentityid("111111111122222");
        staff.setPositionlevel(18);
        staff.setPositiontitle(14);
        staff.setStatus(1);
        staff.setCoemployment(25);
        staff.setFilenumber("00003");
        staff.setFilelocation("档案柜A003");
        staff.setHeight(Float.valueOf("177"));
        staff.setWeight(Float.valueOf("80"));
        staff.setBloodtype(39);
        staff.setStrengths("绘画");
        staff.setHobbies("绘画");
        int count=mapper.insert(staff);
        session.commit();
        System.out.println("count:"+count);
        //4、关闭
        session.close();
    }
}