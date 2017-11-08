package com.dyjs.dao;

import com.dyjs.entity.DyEquipmentTimedTasks;
import java.util.List;

public interface DyEquipmentTimedTasksDao {
	/**
	 * 获取定时任务列表
	 * @author Dyan
	 * @return
	 */
	 List<DyEquipmentTimedTasks> selectTasks();
	 
	 /**
	  * 保存定时任务
	  * @author Dyan
	  * @param equipmentTimedTasks
	  * @return
	  */
	 int insert(DyEquipmentTimedTasks equipmentTimedTasks);
	 
	 /**
	  * 修改定时任务
	  * @author Dyan
	  * @param equipmentTimedTasks
	  * @return
	  */
	 int updateTimeTask(DyEquipmentTimedTasks equipmentTimedTasks);
//    long countByExample(DyEquipmentTimedTasksExample example);
//
//    int deleteByExample(DyEquipmentTimedTasksExample example);
//
//    int deleteByPrimaryKey(String id);
//
//    int insert(DyEquipmentTimedTasks record);
//
//    int insertSelective(DyEquipmentTimedTasks record);
//
//    List<DyEquipmentTimedTasks> selectByExample(DyEquipmentTimedTasksExample example);
//
//    DyEquipmentTimedTasks selectByPrimaryKey(String id);
//
//    int updateByExampleSelective(@Param("record") DyEquipmentTimedTasks record, @Param("example") DyEquipmentTimedTasksExample example);
//
//    int updateByExample(@Param("record") DyEquipmentTimedTasks record, @Param("example") DyEquipmentTimedTasksExample example);
//
//    int updateByPrimaryKeySelective(DyEquipmentTimedTasks record);
//
//    int updateByPrimaryKey(DyEquipmentTimedTasks record);
}