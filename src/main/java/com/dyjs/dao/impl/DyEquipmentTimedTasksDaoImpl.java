package com.dyjs.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dyjs.dao.DyEquipmentTimedTasksDao;
import com.dyjs.entity.DyEquipmentTimedTasks;

@Repository("dyEquipmentTimedTasksDao")
public class DyEquipmentTimedTasksDaoImpl implements DyEquipmentTimedTasksDao {

	@Autowired
	SqlSessionTemplate ssTemplate;
	
	@Override
	public List<DyEquipmentTimedTasks> selectTasks() {
		return  ssTemplate.getMapper(DyEquipmentTimedTasksDao.class).selectTasks();
	}

	@Override
	public int insert(DyEquipmentTimedTasks equipmentTimedTasks) {
		return  ssTemplate.getMapper(DyEquipmentTimedTasksDao.class).insert(equipmentTimedTasks);
	}

	@Override
	public int updateTimeTask(DyEquipmentTimedTasks equipmentTimedTasks) {
		return  ssTemplate.getMapper(DyEquipmentTimedTasksDao.class).updateTimeTask(equipmentTimedTasks);
	}

}
