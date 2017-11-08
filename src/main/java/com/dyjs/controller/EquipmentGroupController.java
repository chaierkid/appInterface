package com.dyjs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dyjs.entity.DyEquipmentGroup;
import com.dyjs.entity.DyGroupEquipment;
import com.dyjs.service.EquipmentGroupService;
import com.dyjs.vo.Result;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

@Api(value="EquipmentGroup",description="设备分组对外接口")
@RestController
@RequestMapping(value = "/Group")
public class EquipmentGroupController {
	@Autowired
	EquipmentGroupService equipmentGroupService;
	
	@ResponseBody
	@RequestMapping(value = "/getGroupList", method = RequestMethod.GET)
    @ApiOperation(value="获取设备分组信息",httpMethod="GET",notes="")
	public Result getGroupList(@RequestParam String parentID) {  
		System.out.println(parentID);
		Result result = new Result();
		//请求安全验证
		
		//if 通过安全验证，请求业务
		//获取分组信息
		List<DyEquipmentGroup> groupList = equipmentGroupService.getEquipmentGroup(parentID);
		if (groupList.size()< 1 ) {
			//获取分析信息下的设备信息
			List<DyGroupEquipment> equipmentList = equipmentGroupService.getEquipment(parentID);
			if(equipmentList.size()<1) {
				result.setStateCode(200);
				result.setMessage("权限内无设备分组信息");
			}else {
				//返回信息
				result.setStateCode(200);
				result.setObject(equipmentList);
			}
		}else {
			//返回信息
			result.setStateCode(200);
			result.setObject(groupList);
		}
		return result;
	}
	
	@ResponseBody
	@RequestMapping(value = "/groupModify", method = RequestMethod.POST)
    @ApiOperation(value="修改设备分组",httpMethod="POST",notes="")
	public Result groupModify(@RequestBody DyEquipmentGroup equipmentGroup) {  
		Result result = new Result();
		//请求安全验证
		
		//if 通过安全验证，请求业务
		//获取分组信息
		int moveResult = equipmentGroupService.groupModify(equipmentGroup);
		if (moveResult <1 ) {
			result.setStateCode(200);
			result.setMessage("设备分组无移动权限");
		}else {
			//返回信息
			result.setStateCode(200);
			result.setMessage("设备分组移动成功");
		}
		return result;
	}
	
	@ResponseBody
	@RequestMapping(value = "/newEquipmentGroup", method = RequestMethod.POST)
    @ApiOperation(value="新建设备分组",httpMethod="POST",notes="")
	public Result newEquipmentGroup(@RequestBody DyEquipmentGroup equipmentGroup) {  
		Result result = new Result();
		//请求安全验证
		
		//if 通过安全验证，请求业务
		//获取分组信息
		int moveResult = equipmentGroupService.insert(equipmentGroup);
		if (moveResult <1 ) {
			result.setStateCode(200);
			result.setMessage("无权限新建设备分组");
		}else {
			//返回信息
			result.setStateCode(200);
			result.setMessage("设备分组新建成功");
		}
		return result;
	}
}
