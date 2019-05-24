package by.itacademy.java.yaskelevich.home.practic7.datalayer;

import java.util.List;

public interface IDao<T, Y> {
    T get(Integer id);

    T insert(T entity);

    void update(T entity);

    void delete(Integer id);

    List<T> getAll();

    Y find(Integer id);

    Y findByName(String name);

}