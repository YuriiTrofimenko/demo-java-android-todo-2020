package org.tyaa.demo.java.android.mytodolist;

import android.util.Log;

import com.orm.SugarRecord;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TodoItem extends SugarRecord {

    // private static int lastId = 0;
    // последний назначенный идентификатор
    private static Long lastId;

    // статический конструктор
    // выполняется при загрузке приложения -
    // при загрузке класса в память
    static {
        lastId = 0L;
    }

    // идентификатор задачи (целое число)
    private Long id;
    // загловок задачи (строка)
    private String title;
    // описание задачи (строка)
    private String description;
    // завершена ли задача
    private Boolean done;
    // дата, на которую запланировано выполнение задачи
    private String date;

    // согласно требований Sugar
    public TodoItem() {
    }

    // конструктор объекта модели задачи
    public TodoItem(String title, String description) {
        // сохранение (копирование) значений аргументов в поля объекта модели задачи
        this.id = ++TodoItem.lastId;
        this.title = title;
        this.description = description;
        this.done = false;
        this.date = new SimpleDateFormat("dd.MM.yyyy").format(new Date());
    }

    // конструктор объекта модели задачи
    public TodoItem(String title, String description, String date) {
        // сохранение (копирование) значений аргументов в поля объекта модели задачи
        this.id = ++TodoItem.lastId;
        this.title = title;
        this.description = description;
        this.done = false;
        this.date = date;
        Log.d("MyTag: date", date);
    }

    // конструктор объекта модели задачи
    public TodoItem(Long id, String title, String description, Boolean done) {
        // сохранение (копирование) значений аргументов в поля объекта модели задачи
        this.id = id;
        this.title = title;
        this.description = description;
        this.done = done;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean isDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
