package com.hxzy.common.vo;

/**
 * @author wy
 * @date 2019-08-12 16:43
 * @comment 分页查询公共的类
 */
public class PageSearchVO {
    /**
     * 排除前几笔
     */
    private Integer offset;

    /**
     * 取几笔
     */
    private Integer limit;

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
