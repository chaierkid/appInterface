package com.dyjs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dyjs.entity.DyEquipmentLog;
import com.dyjs.entity.DyEquipmentWarning;
import com.dyjs.service.EquipmentWarningService;
import com.dyjs.vo.Result;
import com.github.pagehelper.PageHelper;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

@Api(value="EquipmentWarning",description="设备报警对外接口")
@RestController
@RequestMapping(value = "/Warning")
public class EquipmentWarningController {
	
	@Autowired
	EquipmentWarningService equipmentWarningService;
	@ResponseBody
	@RequestMapping(value = "/getEquipmentWarning", method = RequestMethod.GET)
    @ApiOperation(value="获取设备报警信息",httpMethod="GET",notes="")
	public Result getEquipmentWarning(@RequestParam int pageNo ,@RequestParam int pageSize) {  
		Result result = new Result();
		//请求安全验证
		
		//if 通过安全验证，请求业务
		PageHelper.startPage(pageNo, pageSize);  //startPage是告诉拦截器说我要开始分页了。分页参数是这两个。  
		List<DyEquipmentWarning> warnList = equipmentWarningService.selectWarnings();
		
		
		if (warnList.size()< 1 ) {
			result.setStateCode(200);
			result.setMessage("权限内无设备报警信息");
		}else {
			//返回信息
			result.setStateCode(200);
			result.setObject(warnList);
		}

		return result;
	}
	
	@ResponseBody
	@RequestMapping(value = "/getEquipmentStateWarning", method = RequestMethod.GET)
    @ApiOperation(value="获取设备状态报警信息",httpMethod="GET",notes="")
	public Result getEquipmentStateWarning(@RequestParam int pageNo ,@RequestParam int pageSize) {  
		Result result = new Result();
		//请求安全验证
		
		//if 通过安全验证，请求业务
		PageHelper.startPage(pageNo, pageSize);  //startPage是告诉拦截器说我要开始分页了。分页参数是这两个。  
		List<DyEquipmentLog> warnList = equipmentWarningService.selectEquipmentState();
		
		
		if (warnList.size()< 1 ) {
			result.setStateCode(200);
			result.setMessage("权限内无设备状态报警信息");
		}else {
			//返回信息
			result.setStateCode(200);
			result.setObject(warnList);
		}

		return result;
	}
}
