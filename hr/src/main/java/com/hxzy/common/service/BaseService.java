package com.hxzy.common.service;

/**
 * @author wy
 * @date 2019-08-12 16:46
 * @comment 公共的业务逻辑接口
 */
public interface BaseService<T> {

    /**
     * 新增操作
     * @param obj
     * @return
     */
    boolean insert(T obj);


    /**
     * 修改操作
     * @param obj
     * @return
     */
    boolean update(T obj);

    /**
     * 根据主键查询
     * @param id
     * @return
     */
    T findOne(int id);
}
