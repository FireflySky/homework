package com.hxzy.mapper;

import com.hxzy.entity.DataDictionary;
import com.hxzy.vo.DataDirectorySearchVO;

import java.util.List;

/**
 * @author yuanpeng
 * @date 2019-08-15 下午 1:02
 * @comment DataDictionary的Mapper接口
 */
public interface DataDictionaryMapper {
    int insert(DataDictionary dictionary);

    int update(DataDictionary dictionary);

    /**
     * 分页查询接口
     * @return
     */
    List<DataDictionary> dataDictionaryPage(DataDirectorySearchVO searchVO);
}
