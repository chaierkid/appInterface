package com.dyjs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dyjs.dao.DyEquipmentLogDao;
import com.dyjs.dao.DyEquipmentWarningDao;
import com.dyjs.entity.DyEquipmentLog;
import com.dyjs.entity.DyEquipmentWarning;
import com.dyjs.service.EquipmentWarningService;
@Service("equipmentWarningService")
public class EquipmentWarningServiceImpl implements EquipmentWarningService {
	@Resource
	private DyEquipmentWarningDao equipmentWarningDao;
	@Resource
	private DyEquipmentLogDao equipmentLogDao;
	@Override
	public List<DyEquipmentWarning> selectWarnings() {
		return equipmentWarningDao.selectWarnings();
	}

	@Override
	public List<DyEquipmentLog> selectEquipmentState() {
		return equipmentLogDao.selectEquipmentState();
	}

}
