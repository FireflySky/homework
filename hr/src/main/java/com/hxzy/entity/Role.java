package com.hxzy.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wy
 * @date 2019-08-12 17:18
 * @comment 角色实体
 */
@Data
public class Role  implements Serializable{
    private Integer id;
    private String name;
    private Integer status;

}
