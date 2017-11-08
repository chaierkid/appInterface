package com.dyjs.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dyjs.dao.DyEquipmentLinkedDao;
import com.dyjs.entity.DyEquipmentLinked;
@Repository("dyEquipmentLinkedDao")
public class DyEquipmentLinkedDaoImpl implements DyEquipmentLinkedDao{
	@Autowired
	SqlSessionTemplate ssTemplate;
	@Override
	public List<DyEquipmentLinked> getEquipmentLinked() {
		return  ssTemplate.getMapper(DyEquipmentLinkedDao.class).getEquipmentLinked();
	}

}
