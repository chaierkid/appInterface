package com.dyjs.dao;

import com.dyjs.entity.DyEquipmentWarning;
import java.util.List;

public interface DyEquipmentWarningDao {
	
	/**
	 * 获取预警信息列表
	 * @author Dyan
	 * @return
	 */
	List<DyEquipmentWarning> selectWarnings();
//    long countByExample(DyEquipmentWarningExample example);
//
//    int deleteByExample(DyEquipmentWarningExample example);
//
//    int deleteByPrimaryKey(String id);
//
//    int insert(DyEquipmentWarning record);
//
//    int insertSelective(DyEquipmentWarning record);
//
//    List<DyEquipmentWarning> selectByExample(DyEquipmentWarningExample example);
//
//    DyEquipmentWarning selectByPrimaryKey(String id);
//
//    int updateByExampleSelective(@Param("record") DyEquipmentWarning record, @Param("example") DyEquipmentWarningExample example);
//
//    int updateByExample(@Param("record") DyEquipmentWarning record, @Param("example") DyEquipmentWarningExample example);
//
//    int updateByPrimaryKeySelective(DyEquipmentWarning record);
//
//    int updateByPrimaryKey(DyEquipmentWarning record);
}