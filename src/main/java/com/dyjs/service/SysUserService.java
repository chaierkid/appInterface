package com.dyjs.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dyjs.entity.SysUser;

public interface SysUserService {
	SysUser getUser(@Param("username") String username,@Param("password") String password);
	
	List<SysUser> getAllUser();
	
    int updateUserByID(@Param("id") String id, @Param("password") String password, @Param("newPassword") String newPassword);


}
