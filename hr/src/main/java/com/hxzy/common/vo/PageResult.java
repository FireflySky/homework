package com.hxzy.common.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author wy
 * @date 2019-08-12 16:38
 * @comment 数据访问层返回结果
 */
@Getter
@Setter
public class PageResult<T> {

    /**
     * 分页总记录数
     */
   private int totals;

    /**
     * 本次分页的数据
     */
   private List<T> data;

}
