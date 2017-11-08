package com.dyjs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dyjs.entity.DyEquipmentGroup;

public interface DyEquipmentGroupDao {
	/**
	 * 获取设备分组
	 * @author Dyan
	 * @param example
	 * @return
	 */
	List<DyEquipmentGroup> getEquipmentGroup(@Param("parentID") String parentID);
	/**
	 * 设备分组移动
	 * @author Dyan
	 * @param equipmentGroup
	 * @param id
	 * @return
	 */
	int groupModify(DyEquipmentGroup equipmentGroup);
	
	/**
	 * 新建设备分组
	 * @author Dyan
	 * @param record
	 * @return
	 */
	int insert(DyEquipmentGroup equipmentGroup);
//    long countByExample(DyEquipmentGroupExample example);
//
//    int deleteByExample(DyEquipmentGroupExample example);
//
//    int deleteByPrimaryKey(String id);
//
//    int insert(DyEquipmentGroup record);
//
//    int insertSelective(DyEquipmentGroup record);
//
//    List<DyEquipmentGroup> selectByExample(DyEquipmentGroupExample example);
//
//    DyEquipmentGroup selectByPrimaryKey(String id);
//
//    int updateByExampleSelective(@Param("record") DyEquipmentGroup record, @Param("example") DyEquipmentGroupExample example);
//
//    int updateByExample(@Param("record") DyEquipmentGroup record, @Param("example") DyEquipmentGroupExample example);
//
//    int updateByPrimaryKeySelective(DyEquipmentGroup record);
//
//    int updateByPrimaryKey(DyEquipmentGroup record);
}