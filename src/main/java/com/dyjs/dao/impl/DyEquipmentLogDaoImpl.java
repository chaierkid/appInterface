package com.dyjs.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dyjs.dao.DyEquipmentLogDao;
import com.dyjs.entity.DyEquipmentLog;
@Repository("dyEquipmentLogDao")
public class DyEquipmentLogDaoImpl implements DyEquipmentLogDao {
	@Autowired
	SqlSessionTemplate ssTemplate;
	@Override
	public List<DyEquipmentLog> selectEquipmentState() {
		return  ssTemplate.getMapper(DyEquipmentLogDao.class).selectEquipmentState();

	}

}
