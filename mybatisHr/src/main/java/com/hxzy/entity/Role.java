package com.hxzy.entity;

import java.io.Serializable;

/**
 * @author wy
 * @date 2019-08-15 10:28
 * @comment 角色类
 */
public class Role implements Serializable {
    private Integer id;
    private String name;
    private Integer status;

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}

