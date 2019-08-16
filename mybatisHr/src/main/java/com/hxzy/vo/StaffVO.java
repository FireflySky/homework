package com.hxzy.vo;

import com.hxzy.common.vo.PageSearchVO;

/**
 * @author yuanpeng
 * @date 2019-08-16 下午 3:47
 * @comment 员工查询条件
 */
public class StaffVO extends PageSearchVO {
    //员工姓名查询
    private String name;

    private Integer coemployment;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 用工类别
     * @return
     */
    public Integer getCoemployment() {
        return coemployment;
    }

    /**
     * 用工类别
     * @param coemployment
     */
    public void setCoemployment(Integer coemployment) {
        this.coemployment = coemployment;
    }
}
