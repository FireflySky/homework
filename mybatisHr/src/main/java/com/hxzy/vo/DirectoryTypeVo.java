package com.hxzy.vo;

/**
 * @author yuanpeng
 * @date 2019-08-14 下午 4:13
 * @comment 字典类型自定义对象
 */
public class DirectoryTypeVo {
    /**
     * 显示的文字，必须叫text 因为treeView.js规定了
     */
    private String text;
    /**
     * 自定义类型编号
     */
    private Integer typeId;

    public DirectoryTypeVo(String text, Integer typeId) {
        this.text = text;
        this.typeId = typeId;
    }

    public DirectoryTypeVo() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
}
