package com.dyjs.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dyjs.dao.DyUserSafetyDao;
import com.dyjs.entity.DyUserSafety;
@Repository("dyUserSafetyDao")
public class DyUserSafetyDaoImpl implements DyUserSafetyDao {
	@Autowired
	SqlSessionTemplate ssTemplate;
	@Override
	public int insert(DyUserSafety userSafety) {
		return  ssTemplate.getMapper(DyUserSafetyDao.class).insert(userSafety);

	}

	@Override
	public List<DyUserSafety> selectUserSafetyByPersonID(String userID) {
		return  ssTemplate.getMapper(DyUserSafetyDao.class).selectUserSafetyByPersonID(userID);

	}

	@Override
	public int updateSafety(DyUserSafety userSafety) {
		return  ssTemplate.getMapper(DyUserSafetyDao.class).updateSafety(userSafety);

	}

}
