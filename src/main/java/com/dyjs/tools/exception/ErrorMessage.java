package com.dyjs.tools.exception;

import java.util.HashMap;
import java.util.Map;

public class ErrorMessage {
	
	public static Map<String,String> message=new HashMap<String,String>();
	static{
		//验证信息异常
		//验证信息异常，表示用户传参有问题，code会返回那个参数出现了异常
		message.put("1101", "不能为空");
		message.put("1102", "不是数字");
		message.put("1103", "不在范围内");
		message.put("1104", "不是email");
		message.put("1105", "不是电话号码");
		message.put("1106", "不是整型");
		message.put("1107", "长度错误");
		message.put("1108", "不是一个日期类型");
		message.put("1110", "不能重复");
		message.put("1111", "该用户没有操作该中心的权限");
		message.put("1112", "开始日期大于结束日期");
		
		//授权信息异常
		message.put("1201", "您无法获取token信息，您的系统标识key无效，请联系管理员为您分配系统标识key");//表示系统标识key不正确
		message.put("1202", "token过期");//检查token是否过期
		message.put("1203", "您用户信息与token信息不匹配");
		message.put("1204", "您用户授权信息已失效");
		message.put("1205", "不匹配，验证失败");//privateKey不匹配，验证失败
		message.put("1206", "参数异常执行失败");
		message.put("1207", "接口没有访问权限");//确认是否有访问该接口的权限
		message.put("1209", "接口授权过期");
		//JAVA异常信息
		//此类信息要联系管理员
		message.put("1301", "失败");
		message.put("1302", "不允许的操作");
		message.put("1303", "时间格式不正确");
		message.put("1304", "空指针异常");
		message.put("1305", "违反数据库唯一约束");
		//数据库
		//此类信息要联系管理员
		message.put("1401", "数据库连接超时");
		message.put("1402", "调用的sqlcode为空，无法调用方法");
		message.put("1403", "参数异常，无法执行方法");
		message.put("1404", "事务异常");
		message.put("1405", "数据库切换失败");
		message.put("1406", "根据code查询sql不存在");
		message.put("1407", "执行多个批处理方法时需要的参数为空，无法执行");
		message.put("1408", "根据某个值，从数据库查询出来为空");
		message.put("1409", "数据库操作失败");
		message.put("1410", "数据库查询出相同的值");
		message.put("1411", "数据源没有找到，请检查数据源配置");
		
		
		
		
		message.put("1901", "手机号已注册");
		message.put("1902", "验证码失效");
		message.put("1903", "用户名不存在，请重试！");
		message.put("1904", "用户名或密码错误，请重试！");
		message.put("1905", "旧密码错误");
		message.put("1906", "密码相同");
		message.put("1907", "账号重复");
		message.put("1908", "退出成功");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	

