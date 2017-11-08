package com.dyjs.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dyjs.entity.DyUserSafety;
import com.dyjs.entity.SysUser;
import com.dyjs.service.SysUserService;
import com.dyjs.service.UserSafetyService;
import com.dyjs.tools.exception.ClientException;
import com.dyjs.tools.validation.ValidatorNoRequest;
import com.dyjs.vo.Result;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

@Api(value="User",description="用户接口描述")
@RestController
@RequestMapping(value = "/User")
public class SysUserController {
	@Autowired
	SysUserService sysUserService;
	
	@Autowired
	UserSafetyService userSafetyService;

//	/**
//	 * 用户登录
//	 * @author chaierkid
//	 * @param username
//	 * @param password
//	 * @return
//	 */
//	@ResponseBody
//	@RequestMapping(value = "/getUser/{username}/{password}", method = RequestMethod.GET)
//    @ApiOperation(value="根据用户名和密码获取用户信息",httpMethod="GET",notes="")
//	public Result getUser(@PathVariable("username") String username, @PathVariable("password") String password) {
//		Result result = new Result();
//		//请求安全验证
//		
//		
//		//if 通过安全验证，请求业务
//		SysUser student = sysUserService.getUser(username, password);
//		if (student == null) {
//			result.setStateCode(200);
//			result.setMessage("用户/密码不正确，请核对！");
//		}else {
//			//返回信息
//			result.setStateCode(200);
//			result.setObject(student);
//		}
//
//		return result;
//	}

	/**
	 * 获取所有用户
	 * @author chaierkid
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping(value = "/getAllUser", method = RequestMethod.GET)
    @ApiOperation(value="获取所有用户信息",httpMethod="GET",notes="")
	public @ResponseBody Result getAllUser() {
		List<SysUser> student = sysUserService.getAllUser();

		Result result = new Result();
		result.setStateCode(200);
		result.setObject(student);

		return result;
	}
	

	/**
	 * 更新密码
	 * @author chaierkid
	 * @param id
	 * @param password
	 * @param newPassword
	 * @return
	 */
	@RequestMapping(value = "/updatePassword/{id}/{password}/{newPassword}", method = RequestMethod.POST)
    @ApiOperation(value="修改密码",httpMethod="POST",notes="")
	public @ResponseBody Result updatePassword(@PathVariable("id") String id, @PathVariable("password") String password, @PathVariable("newPassword") String newPassword) {
		//操作日志记录
		
		Result result = new Result();
		//请求安全验证
		
		//if 通过，发起业务请求
		//参数验证,业务逻辑选择性验证
		ValidatorNoRequest v = new ValidatorNoRequest();
		v.validation("id",id, ValidatorNoRequest.NO_BLANKS);
		
		//获取错误信息，如果正确errors返回为空hashMap，如果错误返回错误码如：{error=606}
		HashMap<String,String> p = v.getError();
		
		if(!p.isEmpty()){
			System.out.println("验证出错了，验证信息为"+p.get("error").toString());
			throw new ClientException(p.get("error").toString());
		}
		int excResult = sysUserService.updateUserByID(id, password, newPassword);
		
		//返回操作结果
		if(excResult>0) {
			result.setMessage("密码修改成功！");
			result.setStateCode(200);
		}
		return result;
	}
	
	@ResponseBody
	@RequestMapping(value = "/getUserSafety/{userID}", method = RequestMethod.GET)
    @ApiOperation(value="获取当前用户的安全设置",httpMethod="GET",notes="")
	public Result getUserSafety(@PathVariable("userID") String userID) {
		Result result = new Result();
		//请求安全验证
		
		
		//if 通过安全验证，请求业务
		List<DyUserSafety> list = userSafetyService.selectUserSafetyByPersonID(userID);
		if (list.size()<1) {
			result.setStateCode(200);
			result.setMessage("用户未设置安全问题");
		}else {
			//返回信息
			result.setStateCode(200);
			result.setObject(list);
		}

		return result;
	}
	
	@ResponseBody
	@RequestMapping(value = "/newUserSafety", method = RequestMethod.POST)
    @ApiOperation(value="新增当前用户安全设置",httpMethod="POST",notes="")
	public Result newUserSafety(@RequestBody DyUserSafety  userSafety) {
		Result result = new Result();
		//请求安全验证
		
		
		//if 通过安全验证，请求业务
		int insertResult = userSafetyService.insert(userSafety);
		if (insertResult <1 ) {
			result.setStateCode(200);
			result.setMessage("用户安全设置失败");
		}else {
			//返回信息
			result.setStateCode(200);
			result.setObject("用户安全设置成功");
		}

		return result;
	}
	
	@ResponseBody
	@RequestMapping(value = "/updateUserSafety", method = RequestMethod.POST)
    @ApiOperation(value="根修改当前用户的安全设置",httpMethod="POST",notes="")
	public Result updateUserSafety(@RequestBody DyUserSafety  userSafety) {
		Result result = new Result();
		//请求安全验证
		
		
		//if 通过安全验证，请求业务
		//if 通过安全验证，请求业务
		int updateResult = userSafetyService.updateSafety(userSafety);
		if (updateResult <1 ) {
			result.setStateCode(200);
			result.setMessage("用户安全设置修改失败");
		}else {
			//返回信息
			result.setStateCode(200);
			result.setObject("用户安全设置修改成功");
		}

		return result;
	}
}
