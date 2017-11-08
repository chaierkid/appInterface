package com.dyjs.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dyjs.dao.DyEquipmentWarningDao;
import com.dyjs.entity.DyEquipmentWarning;

@Repository("dyEquipmentWarningDao")
public class DyEquipmentWarningDaoImpl implements DyEquipmentWarningDao {
	@Autowired
	SqlSessionTemplate ssTemplate;
	@Override
	public List<DyEquipmentWarning> selectWarnings() {
		return  ssTemplate.getMapper(DyEquipmentWarningDao.class).selectWarnings();

	}

}
