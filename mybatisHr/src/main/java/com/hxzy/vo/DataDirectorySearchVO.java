package com.hxzy.vo;

import com.hxzy.common.vo.PageSearchVO;

/**
 * @author wy
 * @date 2019-08-13 17:27
 * @comment 数据字典查询
 */
public class DataDirectorySearchVO extends PageSearchVO {
    private int typeId;

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }
}
