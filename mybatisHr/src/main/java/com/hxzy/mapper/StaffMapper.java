package com.hxzy.mapper;

import com.hxzy.entity.Staff;
import java.util.List;

import com.hxzy.vo.StaffVO;
import org.apache.ibatis.annotations.Param;

/**
 * @author yuanpeng
 * @date 2019-08-16 上午 10:18
 * @comment 员工的mapper接口
 */
public interface StaffMapper {

    /**
     * 插入
     * @param staff
     * @return
     */
    int insert(Staff staff);

    /**
     * 全部列更新
     * @param staff
     * @return
     */
    int update(Staff staff);

    /**
     * 选择性更新
     * @param staff
     * @return
     */
    int updateSelective(Staff staff);

    Staff findOne(int id);

    /**
     * 按条件查询
     * @param staffVO
     * @return
     */
    List<Staff> search(StaffVO staffVO);
}