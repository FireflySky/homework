package com.hxzy.dao.impl;

import com.hxzy.common.util.JDBCUtil;
import com.hxzy.common.vo.PageResult;
import com.hxzy.dao.RoleDao;
import com.hxzy.entity.Role;
import com.hxzy.vo.RoleSearchVO;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wy
 * @date 2019-08-12 17:29
 * @comment 请详细描述类的作用
 */
public class RoleDaoImplTest {

    private RoleDao  roleDao=null;

    @Before
    public void setUp() throws Exception {
        roleDao=new RoleDaoImpl();
    }



    @Test
    public void insert() throws Exception {
        Role role=new Role();
        role.setName("测试1");
        role.setStatus(0);
        int result=this.roleDao.insert(role);

        Assert.assertTrue( result==1);
    }

    @Test
    public void update() throws Exception {
        Role  role=this.roleDao.findOne(2);
        role.setStatus(1);
        int result=this.roleDao.update(role);
        Assert.assertTrue( result==1);
    }

    @Test
    public void testSql(){
        String sql="select * from role where id=1  and status=2 order by id limit 1,2";
        String temp=JDBCUtil.getCountSql(sql);
        System.out.println(temp);

    }

    @Test
    public void testPage(){
        String sql="select * from role where  1=1 and status=1";
        RoleSearchVO  searchVo=new RoleSearchVO();
        searchVo.setOffset(0);
        searchVo.setLimit(5);
        searchVo.setName("员");
        //查询
        PageResult<Role> pg=this.roleDao.searchPaging(searchVo);

        System.out.println(pg.getTotals());
        for(Role  r : pg.getData()){
            System.out.println(r.getName());
        }

    }
}