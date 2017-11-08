package com.dyjs.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.dyjs.dao.DyEquipmentAttrConfigDao;
import com.dyjs.entity.DyEquipmentAttrConfig;

public class DyEquipmentAttrConfigDaoImpl implements DyEquipmentAttrConfigDao {

	@Autowired
	SqlSessionTemplate ssTemplate;
	@Override
	public long equipmentConfigIsExists(DyEquipmentAttrConfig equipmentAttrConfig) {
		return  ssTemplate.getMapper(DyEquipmentAttrConfigDao.class).equipmentConfigIsExists(equipmentAttrConfig);
	}
	@Override
	public int insert(DyEquipmentAttrConfig equipmentAttrConfig) {
		return  ssTemplate.getMapper(DyEquipmentAttrConfigDao.class).insert(equipmentAttrConfig);
	}
	@Override
	public int updateConfig(DyEquipmentAttrConfig equipmentAttrConfig) {
		return  ssTemplate.getMapper(DyEquipmentAttrConfigDao.class).updateConfig(equipmentAttrConfig);

	}

}
