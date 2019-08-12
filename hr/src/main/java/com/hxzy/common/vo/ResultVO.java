package com.hxzy.common.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author wy
 * @date 2019-08-12 16:47
 * @comment 请详细描述类的作用
 */
@Getter
@Setter
public class ResultVO {
    /**
     * 返回给servlet结果.0代表正确
     */
    private int code;

    /**
     * 返回消息
     */
    private String message;

    /**
     * 返回数据
     */
    private Object  data;
}
