package com.hxzy.common.service;

import com.hxzy.common.vo.PageResult;
import com.hxzy.common.vo.PageSearchVO;
import com.hxzy.common.vo.ResultVO;

/**
 * @author wy
 * @date 2019-08-12 16:46
 * @comment 分页的业务逻辑公共接口
 */
public interface BasePageService<T> extends  BaseService<T> {
    /**
     * 分页查询
     * @param pageSearchVO
     * @return
     */
    ResultVO searchPaging(PageSearchVO pageSearchVO);

}
