package by.itacademy.java.yaskelevich.home.practic7.db;

import java.util.List;

public interface IDao<T> {

    T insert(T entity);

    void update(T entity);

    void delete(Integer id);

    List<T> getAll();

}
