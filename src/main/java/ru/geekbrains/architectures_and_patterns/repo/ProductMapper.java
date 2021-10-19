package ru.geekbrains.architectures_and_patterns.repo;

import ru.geekbrains.architectures_and_patterns.entities.Product;

import java.util.Optional;

//mapper
public interface ProductMapper {


    Optional<Product> find(long productId);

    void insert(Product product) throws RuntimeException;

    void update(Product product) throws RuntimeException;

    void delete(Product product) throws RuntimeException;
}
