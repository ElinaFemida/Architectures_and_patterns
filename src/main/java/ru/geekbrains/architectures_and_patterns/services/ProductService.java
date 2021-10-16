package ru.geekbrains.architectures_and_patterns.services;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import ru.geekbrains.architectures_and_patterns.entities.Product;
import ru.geekbrains.architectures_and_patterns.repo.ProductRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public Optional<Product> findProductById(int id) {
        return productRepository.findById(id).map(Product::new);
    }

    public Page<Product> findAll(Specification<Product> spec, int page, int pageSize) {
        if(page < 0)
            throw new RuntimeException();
        return productRepository.findAll(spec, PageRequest.of(page - 1, pageSize)).map(Product::new);
    }

    public Product saveOrUpdate(Product product) {
        return productRepository.save(product);
    }

    public void deleteById(int id) {
        productRepository.deleteById(id);
    }
}



