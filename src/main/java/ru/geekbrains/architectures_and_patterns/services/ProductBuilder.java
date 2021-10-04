package ru.geekbrains.architectures_and_patterns.services;

import lombok.Data;
import ru.geekbrains.architectures_and_patterns.entities.Product;

@Data
public class ProductBuilder {
    private int productId;
    private String productName = "Default";
    private int productCalories = 0;
    private float productProteins = 0;
    private float productFats = 0;
    private float productCarbs = 0;



    public ProductBuilder buildProductId(int productId) {
        this.productId = productId;
        return this;
    }

    public ProductBuilder buildProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public ProductBuilder buildProductCalories(int productCalories) {
        this.productCalories = productCalories;
        return this;
    }

    public ProductBuilder buildProductProteins(float productProteins) {
        this.productProteins = productProteins;
        return this;
    }

    public ProductBuilder buildProductFats(float productFats) {
        this.productFats = productFats;
        return this;
    }

    public ProductBuilder buildProductProductCarbs(float productCarbs) {
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
