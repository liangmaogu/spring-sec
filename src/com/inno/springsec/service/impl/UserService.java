package com.inno.springsec.service.impl;

import com.inno.springsec.dao.IUserDao;
import com.inno.springsec.model.Users;
import com.inno.springsec.service.IUserService;

public class UserService implements IUserService {
	private IUserDao userDao;
	
	@Override
	public Users getUserByName(String username) {
		return null;
	}

	
	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

}
