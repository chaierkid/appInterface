package com.dyjs.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dyjs.dao.DyEquipmentDao;
import com.dyjs.entity.DyEquipment;

@Repository("dyEquipmentDao")
public class DyEquipmentDaoImpl implements DyEquipmentDao {
	@Autowired
	SqlSessionTemplate ssTemplate;

	@Override
	public List<DyEquipment> selectEquipmentsByPage() {
		return  ssTemplate.getMapper(DyEquipmentDao.class).selectEquipmentsByPage();
	}

	@Override
	public long getEquipmentsCount() {
		// TODO Auto-generated method stub
		return 0;
	}
}
