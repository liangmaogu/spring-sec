package com.inno.springsec.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.inno.springsec.dao.IBaseDao;

public abstract class BaseDao<E> extends HibernateDaoSupport implements IBaseDao<E> {
	@Override
	public void save(E e) {
		this.getHibernateTemplate().save(e);
	}
	
	@Override
	public void update(E e) {
		this.getHibernateTemplate().update(e);
	}

	@Override
	public void delete(E e) {
		this.getHibernateTemplate().delete(e);
	}
	
	public E getById(Class<E> entityClass, Integer id) {
		return this.getHibernateTemplate().load(entityClass, id);
	}
	
	@Override
	public abstract E getById(Integer id);
}
