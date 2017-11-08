package com.dyjs.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dyjs.entity.DyUserSafety;

public interface UserSafetyService {
	 int insert(DyUserSafety userSafety);
	 
	 List<DyUserSafety> selectUserSafetyByPersonID(@Param("userID") String userID);
	 
	 int updateSafety(DyUserSafety userSafety);
}
