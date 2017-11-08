package com.dyjs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dyjs.entity.DyEquipmentLinked;
import com.dyjs.service.EquipmentLinkedService;
import com.dyjs.vo.Result;
import com.github.pagehelper.PageHelper;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

@Api(value="EquipmentLinked",description="设备联动对外接口")
@RestController
@RequestMapping(value = "/Linked")
public class EquipmentLinkedController {
	@Autowired
	EquipmentLinkedService equipmentLinkedService;
	
	@ResponseBody
	@RequestMapping(value = "/getLinkedList", method = RequestMethod.GET)
    @ApiOperation(value="获取设备联动信息",httpMethod="GET",notes="")
	public Result getLinkedList(@RequestParam int pageNo ,@RequestParam int pageSize) {  
		Result result = new Result();
		//请求安全验证
		
		//if 通过安全验证，请求业务
		//获取分组信息
		PageHelper.startPage(pageNo, pageSize);  //startPage是告诉拦截器说我要开始分页了。分页参数是这两个。  
		List<DyEquipmentLinked> linkedList = equipmentLinkedService.getEquipmentLinked();
		if(linkedList.size()<1) {
			result.setStateCode(200);
			result.setMessage("权限内无设备联动信息");
		}else {
			//返回信息
			result.setStateCode(200);
			result.setObject(linkedList);
		}
		return result;
	}
}
