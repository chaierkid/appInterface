package com.dyjs.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dyjs.entity.DyEquipment;
import com.dyjs.entity.DyEquipmentAttrConfig;
import com.dyjs.entity.DyEquipmentTypeAttr;

public interface EquipmentService {
	public List<DyEquipment> selectEquipmentsByPage();  
	
	public List<DyEquipmentTypeAttr> getAttrByEquipmentID(@Param("id")String id) ;
	
	
	public String updateEquipmentAttr(@Param("list")List<DyEquipmentAttrConfig> list) ;
	
	public void controlEquipment(DyEquipment equipment);
}
