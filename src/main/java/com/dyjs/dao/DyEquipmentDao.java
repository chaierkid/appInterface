package com.dyjs.dao;

import java.util.List;


import com.dyjs.entity.DyEquipment;

public interface DyEquipmentDao {
	
	
	/** 
	 * 使用注解方式传入多个参数，用户产品分页，通过登录用户ID查询 
	 * @param pager
	 * @return 
	 */  
	public List<DyEquipment> selectEquipmentsByPage();  
	  
	/** 
	 * 取得产品数量信息，通过登录用户ID查询 
	 * @return 
	 */  
	public long getEquipmentsCount();  
	
//    long countByExample(DyEquipmentExample example);
//
//    int deleteByExample(DyEquipmentExample example);
//
//    int deleteByPrimaryKey(String id);
//
//    int insert(DyEquipment record);
//
//    int insertSelective(DyEquipment record);
//
//    List<DyEquipment> selectByExample(DyEquipmentExample example);
//
//    DyEquipment selectByPrimaryKey(String id);
//
//    int updateByExampleSelective(@Param("record") DyEquipment record, @Param("example") DyEquipmentExample example);
//
//    int updateByExample(@Param("record") DyEquipment record, @Param("example") DyEquipmentExample example);
//
//    int updateByPrimaryKeySelective(DyEquipment record);
//
//    int updateByPrimaryKey(DyEquipment record);
}