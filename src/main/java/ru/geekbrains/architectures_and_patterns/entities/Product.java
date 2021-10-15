package ru.geekbrains.architectures_and_patterns.entities;


import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;



@Entity
@Table (name = "products")
@Data
@NoArgsConstructor
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

