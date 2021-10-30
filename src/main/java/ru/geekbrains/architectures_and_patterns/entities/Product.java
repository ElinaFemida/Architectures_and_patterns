package ru.geekbrains.architectures_and_patterns.entities;


import lombok.*;

import javax.persistence.*;

//Getter'ы и Setter'ы

@Builder
@Entity
@Table (name = "products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productId")
    private long productId;

    @Column(name = "productName")
    private String productName;

    @Column(name = "productCalories")
    private long productCalories;

    @Column(name = "productProteins")
    private long productProteins;

    @Column(name = "productFats")
    private long productFats;

    @Column(name = "productCarbs")
    private long productCarbs;


    public Product(Product product) {
    }
}

