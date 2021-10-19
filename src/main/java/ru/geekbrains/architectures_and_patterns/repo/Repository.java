package ru.geekbrains.architectures_and_patterns.repo;

public interface Repository <T>{

    T findById(long productId);
    T save(T entity);
    void update(T entity);
    void delete(T entity);
}
