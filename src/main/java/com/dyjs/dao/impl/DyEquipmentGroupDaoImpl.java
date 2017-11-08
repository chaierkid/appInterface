package com.dyjs.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dyjs.dao.DyEquipmentGroupDao;
import com.dyjs.entity.DyEquipmentGroup;

@Repository("dyEquipmentGroupDao")
public class DyEquipmentGroupDaoImpl implements DyEquipmentGroupDao {

	@Autowired
	SqlSessionTemplate ssTemplate;
	
	@Override
	public List<DyEquipmentGroup> getEquipmentGroup(String parentID) {
		return  ssTemplate.getMapper(DyEquipmentGroupDao.class).getEquipmentGroup(parentID);

	}

	@Override
	public int groupModify(DyEquipmentGroup equipmentGroup) {
		return  ssTemplate.getMapper(DyEquipmentGroupDao.class).groupModify(equipmentGroup);
	}

	@Override
	public int insert(DyEquipmentGroup equipmentGroup) {
		return  ssTemplate.getMapper(DyEquipmentGroupDao.class).insert(equipmentGroup);
	}

}
