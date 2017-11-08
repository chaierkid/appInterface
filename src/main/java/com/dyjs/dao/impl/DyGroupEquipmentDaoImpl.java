package com.dyjs.dao.impl;

import java.util.List;


import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dyjs.dao.DyGroupEquipmentDao;
import com.dyjs.entity.DyGroupEquipment;

@Repository("dyGroupEquipmentDao")
public class DyGroupEquipmentDaoImpl implements DyGroupEquipmentDao{

	@Autowired
	SqlSessionTemplate ssTemplate;
	
	@Override
	public List<DyGroupEquipment> getEquipmentByGroupID(String groupID) {
		return  ssTemplate.getMapper(DyGroupEquipmentDao.class).getEquipmentByGroupID(groupID);

	}

}
