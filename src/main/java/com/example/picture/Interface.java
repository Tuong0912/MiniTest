package com.example.picture;

import java.util.List;

public interface Interface<T> {
    List<T> findAll();
    void addNew(T t);
    T findById(int id);
    void update(int id , T t);
    void delete(int id);
}
