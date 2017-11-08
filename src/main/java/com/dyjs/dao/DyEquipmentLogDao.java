package com.dyjs.dao;

import com.dyjs.entity.DyEquipmentLog;
import java.util.List;

public interface DyEquipmentLogDao {
	/**
	 * 获取设备状态预警
	 * @author Dyan
	 * @return
	 */
	 List<DyEquipmentLog> selectEquipmentState();
//    long countByExample(DyEquipmentLogExample example);
//
//    int deleteByExample(DyEquipmentLogExample example);
//
//    int deleteByPrimaryKey(String id);
//
//    int insert(DyEquipmentLog record);
//
//    int insertSelective(DyEquipmentLog record);
//
//    List<DyEquipmentLog> selectByExample(DyEquipmentLogExample example);
//
//    DyEquipmentLog selectByPrimaryKey(String id);
//
//    int updateByExampleSelective(@Param("record") DyEquipmentLog record, @Param("example") DyEquipmentLogExample example);
//
//    int updateByExample(@Param("record") DyEquipmentLog record, @Param("example") DyEquipmentLogExample example);
//
//    int updateByPrimaryKeySelective(DyEquipmentLog record);
//
//    int updateByPrimaryKey(DyEquipmentLog record);
}