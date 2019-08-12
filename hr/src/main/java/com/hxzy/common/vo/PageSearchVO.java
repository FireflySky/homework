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

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
