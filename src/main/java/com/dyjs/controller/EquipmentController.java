package com.dyjs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dyjs.entity.DyEquipment;
import com.dyjs.entity.DyEquipmentAttrConfig;
import com.dyjs.entity.DyEquipmentTypeAttr;
import com.dyjs.service.EquipmentService;
import com.dyjs.vo.Result;
import com.github.pagehelper.PageHelper;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

@Api(value="Equipment",description="设备对外接口")
@RestController
@RequestMapping(value = "/Equipment")
public class EquipmentController {
	
	@Autowired
	EquipmentService equipmentService;
	
	@ResponseBody
	@RequestMapping(value = "/getEquipmentList", method = RequestMethod.GET)
    @ApiOperation(value="获取设备信息",httpMethod="GET",notes="")
	public Result getEquipments(@RequestParam int pageNo ,@RequestParam int pageSize  ) {  
		Result result = new Result();
		//请求安全验证
		
		//if 通过安全验证，请求业务
		PageHelper.startPage(pageNo, pageSize);  //startPage是告诉拦截器说我要开始分页了。分页参数是这两个。  
		List<DyEquipment> equipmentList = equipmentService.selectEquipmentsByPage();
		
		if (equipmentList.size()< 1 ) {
			result.setStateCode(200);
			result.setMessage("权限内无设备信息");
		}else {
			//返回信息
			result.setStateCode(200);
			result.setObject(equipmentList);
		}

		return result;
	}
	
	@ResponseBody
	@RequestMapping(value = "/getEquipmentAttr/{id}", method = RequestMethod.GET)
    @ApiOperation(value="获取设备属性信息",httpMethod="GET",notes="")
	public Result getEquipmentAttr(@PathVariable("id") String id) {  
		Result result = new Result();
		//请求安全验证
		
		//if 通过安全验证，请求业务
		List<DyEquipmentTypeAttr> list = equipmentService.getAttrByEquipmentID(id);
		
		if (list.size()< 1 ) {
			result.setStateCode(200);
			result.setMessage("设备无权限内属性");
		}else {
			//返回信息
			result.setStateCode(200);
			result.setObject(list);
		}

		return result;
	}
	
	@ResponseBody
	@RequestMapping(value = "/updateEquipmentAttr", method = RequestMethod.POST)
    @ApiOperation(value="配置设备属性(该方法在swagger中不能直接调用，需要自己写ajax请求)",httpMethod="POST",notes="")
	public Result updateEquipmentAttr(@RequestBody List<DyEquipmentAttrConfig> list) {  
		Result result = new Result();
		//请求安全验证
		
		//if 通过安全验证，请求业务
		String updateResult = equipmentService.updateEquipmentAttr(list);
		if ("success".equals(updateResult) ) {
			//返回信息
			result.setStateCode(200);
			result.setMessage("设备属性修改成功");
			
		}else {
			result.setStateCode(200);
			result.setMessage("设备无修改属性权限");
		}

		return result;
	}
	
	@ResponseBody
	@RequestMapping(value = "/controlEquipment", method = RequestMethod.POST)
    @ApiOperation(value="设备控制",httpMethod="POST",notes="")
	public Result controlEquipment(@RequestBody DyEquipment equipment) {  
		Result result = new Result();
		//请求安全验证
		
		//if 通过安全验证，请求业务
		equipmentService.controlEquipment(equipment);
		result.setStateCode(200);
		result.setMessage("消息已发送");
		return result;
	}
}
