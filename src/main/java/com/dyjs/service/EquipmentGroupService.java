package com.dyjs.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dyjs.entity.DyEquipmentGroup;
import com.dyjs.entity.DyGroupEquipment;

public interface EquipmentGroupService {
	
	List<DyEquipmentGroup> getEquipmentGroup(@Param("parentID") String parentID);
	
	List<DyGroupEquipment> getEquipment(@Param("groupID") String groupID);
	
	int groupModify(DyEquipmentGroup equipmentGroup);
	
	public int insert(DyEquipmentGroup equipmentGroup);
}
