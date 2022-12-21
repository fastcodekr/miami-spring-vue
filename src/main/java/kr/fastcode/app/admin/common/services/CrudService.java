package kr.fastcode.app.admin.common.services;

import kr.fastcode.app.admin.common.services.helpers.Page;

import java.util.List;


public interface CrudService <T> {
	public int save(T param);
	public int update(T param);
	public int count();
	public int delete(T param);
	public boolean exists(String id);
	public List<T> findAll(Page page);
	public T getOne(String id);
	
}

