package ru.geekbrains.architectures_and_patterns.entities;

import lombok.Data;

@Data
public class ProductItem {
    private Product product;
    private int amount;
    private int sumCalories;
    private float sumProteins;
    private float sumFats;
    private float sumCarbs;

    public ProductItem(Product product, int amount) {
        this.product = product;
        this.amount = amount;
        this.sumCalories = product.getProductCalories()*amount;
        this.sumProteins = product.getProductProteins()*amount;
        this.sumFats = product.getProductFats()*amount;
        this.sumCarbs = product.getProductCarbs()*amount;
    }
}


