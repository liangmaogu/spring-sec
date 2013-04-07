package com.inno.springsec.dao.impl;

import com.inno.springsec.model.Roles;

public class RoleDao extends BaseDao<Roles> {

	@Override
	public Roles getById(Integer id) {
		return this.getById(Roles.class, id);
	}

}
