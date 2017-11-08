package com.dyjs.service;

import java.util.List;

import com.dyjs.entity.DyEquipmentTimedTasks;

public interface EquipmentTimedTasksService {
	public List<DyEquipmentTimedTasks> selectTasks() ;
	
	 int insert(DyEquipmentTimedTasks equipmentTimedTasks);
	 
	 int updateTimeTask(DyEquipmentTimedTasks equipmentTimedTasks);
}
