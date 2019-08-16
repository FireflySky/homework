package com.hxzy.mapper;

import com.hxzy.entity.Department;

import java.util.List;

/**
 * @author yuanpeng
 * @date 2019-08-15 下午 2:14
 * @comment 请详细描述类的作用
 */
public interface DepartmentMapper {
    int insert(Department department);

    int update(Department department);

    Department findOne(int id);

    List<Department> findAll();

}
