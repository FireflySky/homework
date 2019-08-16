package com.hxzy.entity;

import java.io.Serializable;

/**
 * @author wy
 * @date 2019-08-13 17:25
 * @comment 数据字典
 */
public class DataDictionary implements Serializable {
    private Integer id;
    private String name;
    private Integer typeId;
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

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
