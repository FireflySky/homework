package com.hxzy.service.impl;

import com.hxzy.common.vo.PageResult;
import com.hxzy.common.vo.ResultVO;
import com.hxzy.entity.DataDictionary;
import com.hxzy.mapper.DataDictionaryMapper;
import com.hxzy.service.DataDictionaryService;
import com.hxzy.util.MybatisUtil;
import com.hxzy.vo.DataDirectorySearchVO;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yuanpeng
 * @date 2019-08-15 下午 3:20
 * @comment 请详细描述类的作用
 */
public class DataDictionaryServiceImpl implements DataDictionaryService {

    SqlSession session=null;
    DataDictionaryMapper mapper=null;

    /**
     * 初始化
     */
    public DataDictionaryServiceImpl(){
        //1、取得SqlSession   以前Connection
        session= MybatisUtil.getSession();
        //2、取得代理对象
        mapper=session.getMapper(DataDictionaryMapper.class);
    }

    @Override
    public boolean insert(DataDictionary dictionary) {
        return false;
    }

    @Override
    public boolean update(DataDictionary dictionary) {
        return false;
    }

    /**
     * 实现分页查询
     * @param typeId
     * @param offset
     * @param limit
     * @return
     */
    @Override
    public ResultVO dataDictionaryPage(Integer typeId, Integer offset, Integer limit) {
        Map<String,Integer> map=new HashMap<>();
        map.put("typeId",typeId);
        map.put("offset",offset);
        map.put("limit",limit);
        System.out.println("limit:"+limit);

        DataDirectorySearchVO searchVO=new DataDirectorySearchVO();
        searchVO.setTypeId(typeId);
        searchVO.setLimit(limit);
        searchVO.setOffset(offset);

        List<DataDictionary> dictionaryList = mapper.dataDictionaryPage(searchVO);
        session.commit();
        session.close();

        PageResult<DataDictionary> result=new PageResult<>();
        result.setTotal(4);
        result.setRows(dictionaryList);

        ResultVO resultVO=new ResultVO();
        resultVO.setCode(0);
        resultVO.setMessage("ok");
        resultVO.setData(result);

        return resultVO;
    }
}
