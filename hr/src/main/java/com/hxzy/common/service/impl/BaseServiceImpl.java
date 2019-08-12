package com.hxzy.common.service.impl;

import com.hxzy.common.dao.BaseDao;
import com.hxzy.common.service.BaseService;
import com.hxzy.common.util.JDBCUtil;

import java.sql.Connection;

/**
 * @author wy
 * @date 2019-08-12 16:49
 * @comment 公共业务逻辑实现类(没有实现分页的而且是抽象的)
 */
public abstract class BaseServiceImpl<T> implements BaseService<T> {

    /**
     * 需要子类赋值的
     */
    private BaseDao<T>   baseDao;

    /**
     * 扩展给子类赋值用的
     * @param baseDao
     */
    public void setBaseDao(BaseDao<T> baseDao) {
        this.baseDao = baseDao;
    }

    @Override
    public boolean insert(T obj) {
        //1、使用本地线程池打开数据库连接
        JDBCUtil.getJdbcUtil().getConnection();

        //2、调用 baseDao.insert方法
        boolean result=this.baseDao.insert(obj)>0;

        //3、关闭本地线程池
        JDBCUtil.getJdbcUtil().close();

        return result;
    }

    @Override
    public boolean update(T obj) {
        //1、使用本地线程池打开数据库连接
        JDBCUtil.getJdbcUtil().getConnection();

        //2、调用 baseDao.insert方法
        boolean result=this.baseDao.update(obj)>0;

        //3、关闭本地线程池
        JDBCUtil.getJdbcUtil().close();

        return result;
    }

    @Override
    public T findOne(int id) {
        //1、使用本地线程池打开数据库连接
        JDBCUtil.getJdbcUtil().getConnection();

        //2、调用 baseDao.insert方法
        T result=this.baseDao.findOne(id);

        //3、关闭本地线程池
        JDBCUtil.getJdbcUtil().close();

        return result;
    }
}
