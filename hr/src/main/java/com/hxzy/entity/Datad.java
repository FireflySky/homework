package com.hxzy.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 字典类
 */
@Getter
@Setter
public class Datad implements Serializable {
    private int id;
    private String name;
    private int typeId;
    private int status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
