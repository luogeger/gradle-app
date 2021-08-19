package com.first.repository;

import com.first.model.TodoItem;

import java.util.HashMap;
import java.util.Map;

public class TodoRepository {
    Map<String, TodoItem> map = new HashMap<>();

    public void save(TodoItem item) {
        System.out.println("    " + item);
        map.put(item.getName(), item);
    }
}
