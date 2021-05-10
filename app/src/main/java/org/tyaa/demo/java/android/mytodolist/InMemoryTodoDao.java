package org.tyaa.demo.java.android.mytodolist;

import java.util.List;

public class InMemoryTodoDao implements ITodoDao {

    @Override
    public List<TodoItem> findAll() {
        return Global.items;
    }

    @Override
    public TodoItem findById(Long id) {
        return Global.items.stream().filter(item -> item.getId().equals(id)).findFirst().get();
    }

    @Override
    public void save(TodoItem item) {
        try {
            findById(item.getId());
        } catch (Exception ex) {
            Global.items.add(item);
        }
    }

    @Override
    public void delete(TodoItem todoItem) {
        Global.items.remove(todoItem);
    }
}
