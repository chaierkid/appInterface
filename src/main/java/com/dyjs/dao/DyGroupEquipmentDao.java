package com.dyjs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dyjs.entity.DyGroupEquipment;

public interface DyGroupEquipmentDao {
	
	/**
	 * 获取分组下的设备列表
	 * @param groupID
	 * @return
	 */
	List<DyGroupEquipment> getEquipmentByGroupID(@Param("groupID")String groupID);
//    long countByExample(DyGroupEquipmentExample example);
//
//    int deleteByExample(DyGroupEquipmentExample example);
//
//    int deleteByPrimaryKey(String id);
//
//    int insert(DyGroupEquipment record);
//
//    int insertSelective(DyGroupEquipment record);
//
//    List<DyGroupEquipment> selectByExample(DyGroupEquipmentExample example);
//
//    DyGroupEquipment selectByPrimaryKey(String id);
//
//    int updateByExampleSelective(@Param("record") DyGroupEquipment record, @Param("example") DyGroupEquipmentExample example);
//
//    int updateByExample(@Param("record") DyGroupEquipment record, @Param("example") DyGroupEquipmentExample example);
//
//    int updateByPrimaryKeySelective(DyGroupEquipment record);
//
//    int updateByPrimaryKey(DyGroupEquipment record);
}