package com.dyjs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dyjs.dao.DyEquipmentTimedTasksDao;
import com.dyjs.entity.DyEquipmentTimedTasks;
import com.dyjs.service.EquipmentTimedTasksService;

@Service("equipmentTimedTasksService")
public class EquipmentTimedTasksServiceImpl implements EquipmentTimedTasksService {

	@Resource
	private DyEquipmentTimedTasksDao equipmentTimedTasksDao;
	
	@Override
	public List<DyEquipmentTimedTasks> selectTasks() {
		return equipmentTimedTasksDao.selectTasks();
	}

	@Override
	public int insert(DyEquipmentTimedTasks equipmentTimedTasks) {
		return equipmentTimedTasksDao.insert(equipmentTimedTasks);
	}

	@Override
	public int updateTimeTask(DyEquipmentTimedTasks equipmentTimedTasks) {
		return equipmentTimedTasksDao.updateTimeTask(equipmentTimedTasks);
	}

}
