package com.dyjs.service.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dyjs.dao.SysUserDao;
import com.dyjs.entity.SysUser;
import com.dyjs.service.SysUserService;

@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {

	@Resource
	private SysUserDao sysUserDao;
    @Override
    public SysUser getUser( String username,  String password) {
        return sysUserDao.getUser(username,password);
    }
    
    @Override
    public List<SysUser> getAllUser() {
        return sysUserDao.getAllUser();
    }
    
    @Override
	public int updateUserByID(String id, String password, String newPassword) {
        return sysUserDao.updateUserByID(id, password, newPassword);
    }
	
}
