package ru.geekbrains.architectures_and_patterns.services;

import lombok.Data;
import ru.geekbrains.architectures_and_patterns.entities.Product;

@Data
public class ProductBuilder {
    private long productId;
    private String productName = "Default";
    private long productCalories = 0;
    private long productProteins = 0;
    private long productFats = 0;
    private long productCarbs = 0;



    public ProductBuilder buildProductId(long productId) {
        this.productId = productId;
        return this;
    }

    public ProductBuilder buildProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public ProductBuilder buildProductCalories(long productCalories) {
        this.productCalories = productCalories;
        return this;
    }

    public ProductBuilder buildProductProteins(long productProteins) {
        this.productProteins = productProteins;
        return this;
    }

    public ProductBuilder buildProductFats(long productFats) {
        this.productFats = productFats;
        return this;
    }

    public ProductBuilder buildProductCarbs(long productCarbs) {
        this.productCarbs = productCarbs;
        return this;
    }

    public Product build() {
        Product product = new Product();
        product.setProductId(productId);
        product.setProductName(productName);
        product.setProductCalories(productCalories);
        product.setProductProteins(productProteins);
        product.setProductFats(productFats);
        product.setProductCarbs(productCarbs);
        return product;
    }
}
