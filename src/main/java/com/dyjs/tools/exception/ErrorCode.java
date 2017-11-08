package com.dyjs.tools.exception;

 
public class ErrorCode {
	public static String SUCCESS="111111111111";
	public static String CLIENTEXCEPTION="1";//客户端异常
	public static String SERVICEEXCEPTION="2";//服务器异常
	
	
	//验证信息异常 11xx 提供100个该类信息码使用
	public static String VALIDATE_NOTNULL="1101";//不能为空
	public static String VALIDATE_NOTNUMBER="1102";//不是数字
	public static String VALIDATE_NOTINRANGE="1103";//不在范围内
	public static String VALIDATE_NOTMAIL="1104";//不是email
	public static String VALIDATE_NOTPHONE="1105";//不是电话号码
	public static String VALIDATE_NOTINTEGER="1106";//不是整形
	public static String VALIDATE_LENGERROR="1107";//长度错误
	public static String VALIDATE_DATE="1108";//不是一个日期类型
	public static String VALIDATE_PARAMETER_FORMAT="1109";//参数格式不正确
	public static String VALIDATE_PARAMETER_REPEAT="1110";//参数重复判断
	public static String VALIDATE_ORGCENTER="1111";//该用户没有操作该中心的权限
	public static String VALIDATE_DateCompare="1112";//开始时间不能大于结束时间
	
	
    //授权信息异常 12xx
	public static String AUTHORIZATION_GETTOKENFAIL="1201";//您无法获取token信息，您的系统标识key无效，请联系管理员为您分配系统标识key
	public static String AUTHORIZATION_TOKENOUT="1202";//token过期
	public static String AUTHORIZATION_USERTOKENMATCH="1203";//您用户信息与token信息不匹配
	public static String AUTHORIZATION_USERAUTHORIZATIONFAIL="1204";//您用户授权信息已失效
	public static String AUTHORIZATION_PRIVATEKEYVERIFICATIONFAIL="1205";//privateKey不匹配，验证失败
	public static String AUTHORIZATION_PARAMEXCEPTION="1206";//参数异常执行失败
	public static String AUTHORIZATION_INTERFACEACCESS="1207";//接口没有访问权限
	public static String AUTHORIZATION_UUID="1208";//UUID不存在
	public static String AUTHORIZATION_INTERFACEOUT="1209";//接口授权过期
	
	//JAVA异常信息 13xx
	public static String JAVA_OPERFAIL="1301";//失败
	public static String JAVA_NOPERMISSIONSOPER="1302";//不允许的操作
	public static String JAVA_DATEEXCEPTION="1303";//时间格式不正确
	public static String JAVA_NUllPOINTEREXCEPTION="1304";//空指针异常
	public static String JAVA_INTERGRITYCONSTRAINTVIOLATION="1305";//违反唯一约束
	
	//数据库异常 14xx
	public static String DATABASE_TIMEOUT="1401";//数据库连接超时
	public static String DATABASE_SQLCODEERROR="1402";//调用的sqlcode为空，无法调用方法
	public static String DATABASE_PARAMEXCEPTION="1403";//参数异常，无法执行方法
	public static String DATABASE_TRANSACTION="1404";//事务异常
	public static final String DATABASE_DATABASE_EMPTY="1405";//数据库切换失败
	public static final String DATABASE_SQL_NOTEXIST="1406";//根据code查询sql不存在
	public static final String DATABASE_BATCHPARAM_EMPTY="1407";//执行多个批处理方法时需要的参数为空，无法执行
	public static final String DATABASE_QUERY_EMPTY="1408";//根据某个值，从数据库查询出来为空
	public static final String DATABASE_OPERFAIL="1409";//数据库操作失败
	public static final String DATABASE_QUERY_REPEAT="1410";//数据库查询出相同的值
	public static String DATABASE_NOSOURCE="1411";//数据源没有找到，请检查数据源配置
	
	
	
	
	//特色业务异常 19xx
	public static String OTHER_PHONEREPEAT="1901";//手机号已注册
	public static String OTHER_VERIFICATIONCODEOUT="1902";//验证码失效
	public static String OTHER_USERNOEXIST="1903";//登录返回语句：用户名不存在，请重新填写！
	public static String OTHER_LOGINFAIL="1904";//用户名与密码不一致，请重新填写！
	public static String OTHER_OLDPASSWDERROR="1905";//旧密码错误
	public static String OTHER_TWOPASSWDEQUALS="1906";//密码相同
	public static String OTHER_USERACCOUNTREPEAT="1907";//账号重复
	public static String OTHER_LOGOUTSUCC="1908";//退出成功
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	

