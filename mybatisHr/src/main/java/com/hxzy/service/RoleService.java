package com.hxzy.service;

import com.hxzy.entity.Role;

import java.util.List;

/**
 * @author yuanpeng
 * @date 2019-08-15 下午 2:31
 * @comment 角色的Service接口
 */
public interface RoleService {
    boolean insert(Role role);

    boolean update(Role role);

    Role findOne(int id);

    List<Role> findAll();
}
