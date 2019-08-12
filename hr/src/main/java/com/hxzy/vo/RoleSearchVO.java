package com.hxzy.vo;

import com.hxzy.common.vo.PageSearchVO;
import lombok.Getter;
import lombok.Setter;

/**
 * @author wy
 * @date 2019-08-12 17:34
 * @comment 角色分页查询条件
 */
@Getter
@Setter
public class RoleSearchVO extends PageSearchVO{

    /**
     * 按照名称查询
     */
    private String name;

}
