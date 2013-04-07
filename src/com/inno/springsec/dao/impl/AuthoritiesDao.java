package com.inno.springsec.dao.impl;

import com.inno.springsec.model.Authorities;

public class AuthoritiesDao extends BaseDao<Authorities> {

	@Override
	public Authorities getById(Integer id) {
		return this.getById(Authorities.class, id);
	}
	
}
