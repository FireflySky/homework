package com.hxzy.common.vo;


import java.util.List;

/**
 * @author wy
 * @date 2019-08-12 16:38
 * @comment 数据访问层返回结果
 */

public class PageResult<T> {

    /**
     * 分页总记录数
     */
    private int total;

    /**
     * 本次分页的数据
     */
    private List<T> rows;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
