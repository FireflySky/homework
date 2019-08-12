package com.hxzy.common.dao;

import com.hxzy.common.vo.PageResult;
import com.hxzy.common.vo.PageSearchVO;

/**
 * @author wy
 * @date 2019-08-12 16:37
 * @comment 分页数据访问
 */
public interface BasePageDao<T> extends  BaseDao<T> {

    /**
     * 分页查询
     * @param pageSearchVO
     * @return
     */
    PageResult<T>  searchPaging(PageSearchVO pageSearchVO);
}
