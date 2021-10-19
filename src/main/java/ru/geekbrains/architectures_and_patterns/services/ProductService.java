package ru.geekbrains.architectures_and_patterns.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.geekbrains.architectures_and_patterns.entities.Product;
import ru.geekbrains.architectures_and_patterns.repo.ProductRepository;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository repo;

    public Product findProductById(long productId) {
        return repo.findById(productId);
    }

    public Product saveOrUpdate(Product product) {
        return repo.save(product);
    }

    public void deleteById(Product product) {
        repo.delete(product);
    }

}



