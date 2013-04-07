package com.inno.springsec.dao;

public interface IBaseDao<E> {

	public void save(E e);

	public void update(E e);

	public void delete(E e);

	public E getById(Integer id);

}