package kr.fastcode.app.admin.common.domains.dao;

import java.util.List;

import kr.fastcode.app.admin.common.services.helpers.Page;


public interface CrudRepository<T> {
	public int save(T param);
	public int update(T param);
	public int count();
	public int delete(T param);
	public boolean exists(String id);
	public List<T> findAll(Page page);
	public T getOne(String id);
	
}
