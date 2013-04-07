package com.inno.springsec.dao.impl;

import com.inno.springsec.model.Users;

public class UserDao extends BaseDao<Users> {

	@Override
	public Users getById(Integer id) {
		return this.getById(Users.class, id);
	}
	
}
