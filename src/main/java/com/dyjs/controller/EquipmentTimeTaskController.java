package com.dyjs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dyjs.entity.DyEquipmentTimedTasks;
import com.dyjs.service.EquipmentTimedTasksService;
import com.dyjs.vo.Result;
import com.github.pagehelper.PageHelper;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

@Api(value="EquipmentTimeTask",description="设备定时任务对外接口")
@RestController
@RequestMapping(value = "/TimeTask")
public class EquipmentTimeTaskController {
	@Autowired
	EquipmentTimedTasksService equipmentTimedTasksService;
	
	@ResponseBody
	@RequestMapping(value = "/getEquipmentTimeTasks", method = RequestMethod.GET)
    @ApiOperation(value="获取设备定时任务",httpMethod="GET",notes="")
	public Result getEquipmentTimeTasks(@RequestParam int pageNo ,@RequestParam int pageSize) {  
		Result result = new Result();
		//请求安全验证
		
		//if 通过安全验证，请求业务
		PageHelper.startPage(pageNo, pageSize);  //startPage是告诉拦截器说我要开始分页了。分页参数是这两个。  
		List<DyEquipmentTimedTasks> taskList = equipmentTimedTasksService.selectTasks();
		
		
		if (taskList.size()< 1 ) {
			result.setStateCode(200);
			result.setMessage("权限内无设备定时任务信息");
		}else {
			//返回信息
			result.setStateCode(200);
			result.setObject(taskList);
		}

		return result;
	}
	
	@ResponseBody
	@RequestMapping(value = "/updateEquipmentTimeTasks", method = RequestMethod.POST)
    @ApiOperation(value="修改设备定时任务",httpMethod="POST",notes="")
	public Result updateEquipmentTimeTasks(@RequestBody DyEquipmentTimedTasks equipmentTimedTasks) {  
		Result result = new Result();
		//请求安全验证
		
		//if 通过安全验证，请求业务
		int updateResult = equipmentTimedTasksService.updateTimeTask(equipmentTimedTasks);
		
		
		if (updateResult<1 ) {
			result.setStateCode(200);
			result.setMessage("没有修改设备定时任务的权限");
		}else {
			//返回信息
			result.setStateCode(200);
			result.setObject("定时任务修改成功");
		}

		return result;
	}
	
	@ResponseBody
	@RequestMapping(value = "/newEquipmentTimeTasks", method = RequestMethod.POST)
    @ApiOperation(value="新建设备定时任务",httpMethod="POST",notes="")
	public Result newEquipmentTimeTasks(@RequestBody DyEquipmentTimedTasks equipmentTimedTasks) {  
		Result result = new Result();
		//请求安全验证
		
		//if 通过安全验证，请求业务
		int updateResult = equipmentTimedTasksService.insert(equipmentTimedTasks);
		
		
		if (updateResult<1 ) {
			result.setStateCode(200);
			result.setMessage("没有新建设备定时任务的权限");
		}else {
			//返回信息
			result.setStateCode(200);
			result.setObject("定时任务新建成功！");
		}

		return result;
	}
}
