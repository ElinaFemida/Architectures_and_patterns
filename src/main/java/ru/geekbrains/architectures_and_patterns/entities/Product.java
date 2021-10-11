package ru.geekbrains.architectures_and_patterns.entities;


import lombok.Data;


@Data
public class Product  {
    private int productId;
    private String productName;
    private int productCalories;
    private long productProteins;
    private long productFats;
    private long productCarbs;


}
