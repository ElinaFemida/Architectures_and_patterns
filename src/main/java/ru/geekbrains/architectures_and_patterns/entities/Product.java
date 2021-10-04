package ru.geekbrains.architectures_and_patterns.entities;


import lombok.Data;


@Data
public class Product {
    private int productId;
    private String productName;
    private int productCalories;
    private float productProteins;
    private float productFats;
    private float productCarbs;
}
