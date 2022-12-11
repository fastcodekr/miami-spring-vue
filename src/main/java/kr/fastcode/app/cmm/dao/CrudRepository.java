package kr.fastcode.app.cmm.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import kr.fastcode.app.cmm.util.Page;
import org.springframework.http.ResponseEntity;


public interface CrudRepository<T> {
	public int save(T param);
	public int update(T param);
	public int count();
	public int delete(T param);
	public boolean exists(String id);
	public List<T> findAll(Page page);
	public T getOne(String id);
	
}
