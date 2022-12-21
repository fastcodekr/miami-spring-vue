package kr.fastcode.app.admin.common.controllers;

import kr.fastcode.app.admin.common.domains.generics.Box;
import org.springframework.http.ResponseEntity;

public abstract class CrudController<T> {
    public abstract ResponseEntity<Integer> save(T t);
    public abstract ResponseEntity<Integer> update(T t);
    public abstract ResponseEntity<Integer> count();
    public abstract ResponseEntity<Integer> delete(T t);
    public abstract ResponseEntity<Boolean> exists(String id);
    public abstract ResponseEntity<Box<T>> findAll(String page);
    public abstract ResponseEntity<T> getOne(String id);

}
