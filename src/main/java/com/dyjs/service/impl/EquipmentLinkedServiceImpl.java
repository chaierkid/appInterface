package com.dyjs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dyjs.dao.DyEquipmentLinkedDao;
import com.dyjs.entity.DyEquipmentLinked;
import com.dyjs.service.EquipmentLinkedService;
@Service("equipmentLinkedService")
public class EquipmentLinkedServiceImpl implements EquipmentLinkedService {

	@Resource
	private DyEquipmentLinkedDao equipmentLinkedDao;
	@Override
	public List<DyEquipmentLinked> getEquipmentLinked() {
		return equipmentLinkedDao.getEquipmentLinked();
	}

}
