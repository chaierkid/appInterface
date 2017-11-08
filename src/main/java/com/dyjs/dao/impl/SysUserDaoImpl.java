package com.dyjs.dao.impl;


import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dyjs.dao.SysUserDao;
import com.dyjs.entity.SysUser;

@Repository("sysUserDao")
public class SysUserDaoImpl implements SysUserDao {
	
	@Autowired
	SqlSessionTemplate ssTemplate;
	
	@Override
	public SysUser getUser( String username,  String password) {
		// TODO Auto-generated method stub
		return ssTemplate.getMapper(SysUserDao.class).getUser(username,password);
	}
	
	@Override
	public List<SysUser> getAllUser() {
		// TODO Auto-generated method stub
		return ssTemplate.getMapper(SysUserDao.class).getAllUser();
	}

	@Override
	public int updateUserByID(String id, String password, String newPassword) {
		return ssTemplate.getMapper(SysUserDao.class).updateUserByID(id, password, newPassword);
	}

}
