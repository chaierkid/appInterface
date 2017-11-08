package com.dyjs.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dyjs.dao.DyOperationLogDao;
import com.dyjs.entity.DyOperationLog;
@Repository("dyOperationLogDao")
public class DyOperationLogDaoImpl implements DyOperationLogDao{

	@Autowired
	SqlSessionTemplate ssTemplate;
	@Override
	public int insert(DyOperationLog dyOperationLog) {
		return  ssTemplate.getMapper(DyOperationLogDao.class).insert(dyOperationLog);
	}

}
