package kr.fastcode.app.cmm.web;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import kr.fastcode.app.cmm.generic.Box;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public abstract class CrudController<T> {
    public abstract ResponseEntity<Integer> save(T t);
    public abstract ResponseEntity<Integer> update(T t);
    public abstract ResponseEntity<Integer> count();
    public abstract ResponseEntity<Integer> delete(T t);
    public abstract ResponseEntity<Boolean> exists(String id);
    public abstract ResponseEntity<Box<T>> findAll(String page);
    public abstract ResponseEntity<T> getOne(String id);

}
