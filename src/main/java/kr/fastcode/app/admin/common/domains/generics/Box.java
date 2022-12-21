package kr.fastcode.app.admin.common.domains.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import kr.fastcode.app.admin.common.services.helpers.Page;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Lazy @Data
public class Box<T> {
    private HashMap<String,T> map;
    private List<T> list;
    private Page page;
    public Box() {
        map = new HashMap<String, T>();
        list = new ArrayList<T>();
        page = new Page();
    }
    public void clear() {
        map.clear();
        page = new Page();
        list = new ArrayList<>();
    }
    public int length() {return list.size();}
    public boolean	containsKey(String key) {return map.containsKey(key);}
    public boolean	containsValue(String value) {return map.containsValue(value);}
    public boolean	isEmpty() {return map.isEmpty();}
    public void put(String s, T t) {map.put(s, t);}
    public void remove(String key) {map.remove(key);}
    public void replace(String key, T t) {map.replace(key, t);}
    public int size() {return map.size();}
    @SuppressWarnings("unchecked")
    public List<T> listValues(String key){return (List<T>) map.get(key);}
    @SuppressWarnings("unchecked")
    public Set<T> setValues(String key){return (Set<T>) map.get(key);}
}
