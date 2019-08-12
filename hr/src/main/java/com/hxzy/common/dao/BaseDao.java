package com.hxzy.common.dao;

/**
 * @author wy
 * @date 2019-08-12 16:34
 * @comment 请详细描述类的作用
 */
public interface BaseDao<T> {

    /**
     * 新增操作
     * @param obj
     * @return
     */
    int insert(T obj);


    /**
     * 修改操作
     * @param obj
     * @return
     */
    int update(T obj);

    /**
     * 根据主键查询
     * @param id
     * @return
     */
    T findOne(int id);

}
