package com.dyjs.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dyjs.dao.DyEquipmentTypeAttrDao;
import com.dyjs.entity.DyEquipmentTypeAttr;


@Repository("dyEquipmentAttrConfigDao")
public class DyEquipmentTypeAttrDaoImpl implements DyEquipmentTypeAttrDao {
	
	@Autowired
	SqlSessionTemplate ssTemplate;
	@Override
	public List<DyEquipmentTypeAttr> getAttrByEquipmentTypeID(String id) {
		return  ssTemplate.getMapper(DyEquipmentTypeAttrDao.class).getAttrByEquipmentTypeID(id);

	}

}
