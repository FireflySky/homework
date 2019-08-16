package com.hxzy.service;

import com.hxzy.common.vo.ResultVO;
import com.hxzy.entity.DataDictionary;


/**
 * @author yuanpeng
 * @date 2019-08-15 下午 2:41
 * @comment 字典类的Service
 */
public interface DataDictionaryService {

    boolean insert(DataDictionary dictionary);

    boolean update(DataDictionary dictionary);
    /**
     * 分页查询接口
     * @return
     */
    ResultVO dataDictionaryPage(Integer typeId, Integer offset, Integer limit);
}
