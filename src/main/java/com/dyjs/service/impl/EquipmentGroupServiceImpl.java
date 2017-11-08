package com.dyjs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dyjs.dao.DyEquipmentGroupDao;
import com.dyjs.dao.DyGroupEquipmentDao;
import com.dyjs.entity.DyEquipmentGroup;
import com.dyjs.entity.DyGroupEquipment;
import com.dyjs.service.EquipmentGroupService;

@Service("equipmentGroupService")
public class EquipmentGroupServiceImpl implements EquipmentGroupService {

	@Resource
	private DyEquipmentGroupDao equipmentGroupDao;
	@Resource
	private DyGroupEquipmentDao groupEquipmentDao;
	
	@Override
	public List<DyEquipmentGroup> getEquipmentGroup(String parentID) {
		return equipmentGroupDao.getEquipmentGroup(parentID);
	}

	@Override
	public List<DyGroupEquipment> getEquipment(String groupID) {
		return groupEquipmentDao.getEquipmentByGroupID(groupID);
	}

	@Override
	public int groupModify(DyEquipmentGroup equipmentGroup) {
		return equipmentGroupDao.groupModify(equipmentGroup);
	}

	@Override
	public int insert(DyEquipmentGroup equipmentGroup) {
		return equipmentGroupDao.insert(equipmentGroup);
	}

}
