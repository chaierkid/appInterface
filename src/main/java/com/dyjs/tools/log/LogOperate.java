package com.dyjs.tools.log;

import java.util.Arrays;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;

import com.dyjs.dao.DyOperationLogDao;
import com.dyjs.entity.DyOperationLog;



public class LogOperate {
	@Resource
	private DyOperationLogDao DyOperationLogDao;
	
	private static Logger logger = Logger.getLogger(LogOperate.class);

	@Before(value = "execution(* com.dyjs.controller.*.*(..))")
	public void before(JoinPoint joinPoint) {
		logger.info("get start!");
		
		String methodName = joinPoint.getSignature().getName();  
		Object[] argsa = joinPoint.getArgs();  
		DyOperationLog dyOperationLog = new DyOperationLog();
		String id = UUID.randomUUID().toString().replace("-","");
		dyOperationLog.setId(id);
		dyOperationLog.setOperateName(methodName);
		dyOperationLog.setOperateParams(Arrays.toString(argsa));
		DyOperationLogDao.insert(dyOperationLog);  
	}

	@After(value = "execution(* com.dyjs.controller.*.*(..))")
	public void after() {
		logger.info("get end!");
	}

}
