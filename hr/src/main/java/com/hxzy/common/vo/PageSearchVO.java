package com.hxzy.common.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author wy
 * @date 2019-08-12 16:43
 * @comment 分页查询公共的类
 */
@Getter
@Setter
public class PageSearchVO {
    /**
     * 排除前几笔
     */
    private int offset;

    /**
     * 取几笔
     */
    private int limit;
}
