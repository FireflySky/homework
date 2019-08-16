package com.hxzy.service.impl;

import com.hxzy.service.DataDictionaryService;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author yuanpeng
 * @date 2019-08-15 下午 3:28
 * @comment 请详细描述类的作用
 */
public class DataDictionaryServiceImplTest {

    @Test
    public void dataDictionaryPage() {
        DataDictionaryService service=new DataDictionaryServiceImpl();
        service.dataDictionaryPage(2,2,4);
    }
}