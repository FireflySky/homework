package com.hxzy.service.impl;

import com.hxzy.entity.Role;
import com.hxzy.mapper.RoleMapper;
import com.hxzy.service.RoleService;
import com.hxzy.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author yuanpeng
 * @date 2019-08-15 下午 2:29
 * @comment 角色类的service
 */
public class RoleServiceImpl implements RoleService {

    SqlSession session=null;
    RoleMapper roleMapper=null;

    public RoleServiceImpl(){
        //1、取得SqlSession   以前Connection
        session= MybatisUtil.getSession();
        //2、取得代理对象
        roleMapper=session.getMapper(RoleMapper.class);
    }

    @Override
    public boolean insert(Role role) {
        //将传入的对象添加进数据库
        int count=roleMapper.insert(role);
        //4、提交事务
        session.commit();
        //5、关闭session，回收给连接池
        session.close();
        return count>0;
    }

    @Override
    public boolean update(Role role) {
        int count = roleMapper.update(role);
        session.commit();
        session.close();
        return count>0;
    }

    @Override
    public Role findOne(int id) {
        return null;
    }

    @Override
    public List<Role> findAll() {
        return null;
    }
}
