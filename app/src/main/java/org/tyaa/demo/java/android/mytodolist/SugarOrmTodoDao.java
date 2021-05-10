package org.tyaa.demo.java.android.mytodolist;

import java.util.List;

public class SugarOrmTodoDao implements ITodoDao {

    @Override
    public List<TodoItem> findAll() {
        Global.items.clear();
        Global.items.addAll(TodoItem.listAll(TodoItem.class));
        return Global.items;
    }

    @Override
    public TodoItem findById(Long id) {
        return TodoItem.findById(TodoItem.class, id);
    }

    @Override
    public void save(TodoItem item) {
        item.save();
        findAll();
    }

    @Override
    public void delete(TodoItem item) {
        item.delete();
        findAll();
    }
}
