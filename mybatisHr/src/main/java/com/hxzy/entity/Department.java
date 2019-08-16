package com.hxzy.entity;

import java.io.Serializable;

/**
 * @author yuanpeng
 * @date 2019-08-13 上午 9:03
 * @comment 部门类
 */
public class Department implements Serializable {
    private Integer id;
    private String  name;
    private Integer sorts;
    private Integer parentId;
    private Integer status;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSorts() {
        return sorts;
    }

    public void setSorts(Integer sorts) {
        this.sorts = sorts;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
}
