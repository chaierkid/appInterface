package com.dyjs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dyjs.dao.DyUserSafetyDao;
import com.dyjs.entity.DyUserSafety;
import com.dyjs.service.UserSafetyService;
@Service("userSafetyService")
public class UserSafetyServiceImpl implements UserSafetyService {
	@Resource
	private DyUserSafetyDao userSafetyDao;
	@Override
	public int insert(DyUserSafety userSafety) {
		return userSafetyDao.insert(userSafety);
	}

	@Override
	public List<DyUserSafety> selectUserSafetyByPersonID(String userID) {
		return userSafetyDao.selectUserSafetyByPersonID(userID);
	}

	@Override
	public int updateSafety(DyUserSafety userSafety) {
		return userSafetyDao.updateSafety(userSafety);
	}

}
