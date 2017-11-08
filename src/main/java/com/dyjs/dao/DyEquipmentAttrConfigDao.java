package com.dyjs.dao;

import com.dyjs.entity.DyEquipmentAttrConfig;

public interface DyEquipmentAttrConfigDao {
	/**
	 * 判断属性是否配置过
	 * @author Dyan
	 * @param equipmentAttrConfig
	 * @return
	 */
	long equipmentConfigIsExists(DyEquipmentAttrConfig equipmentAttrConfig);
	
	/**
	 * 插入属性配置
	 * @author Dyan
	 * @param record
	 * @return
	 */
	int insert(DyEquipmentAttrConfig equipmentAttrConfig);
	
	/**
	 * 更新属性配置
	 * @author Dyan
	 * @param record
	 * @return
	 */
	int updateConfig(DyEquipmentAttrConfig equipmentAttrConfig);

//    long countByExample(DyEquipmentAttrConfigExample example);
//
//    int deleteByExample(DyEquipmentAttrConfigExample example);
//
//    int deleteByPrimaryKey(String id);
//
//    int insert(DyEquipmentAttrConfig record);
//
//    int insertSelective(DyEquipmentAttrConfig record);
//
//    List<DyEquipmentAttrConfig> selectByExample(DyEquipmentAttrConfigExample example);
//
//    DyEquipmentAttrConfig selectByPrimaryKey(String id);
//
//    int updateByExampleSelective(@Param("record") DyEquipmentAttrConfig record, @Param("example") DyEquipmentAttrConfigExample example);
//
//    int updateByExample(@Param("record") DyEquipmentAttrConfig record, @Param("example") DyEquipmentAttrConfigExample example);
//
//    int updateByPrimaryKeySelective(DyEquipmentAttrConfig record);
//
//    int updateByPrimaryKey(DyEquipmentAttrConfig record);
}