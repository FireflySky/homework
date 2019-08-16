package com.hxzy.mapper;

import com.hxzy.entity.Role;

import java.util.List;

/**
 * @author wy
 * @date 2019-08-15 10:29
 * @comment mybatis底层数据库操作的接口
 */
public interface RoleMapper {

    int insert(Role role);

    int update(Role role);

    Role findOne(int id);

    List<Role> findAll();
}
