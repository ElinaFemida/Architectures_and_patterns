package ru.geekbrains.architectures_and_patterns;

import ru.geekbrains.architectures_and_patterns.entities.Product;
import ru.geekbrains.architectures_and_patterns.services.ProductBuilder;

//добавление нового продукта в БД клиентом
// дефолтные значения полей продукта определены в ProductBuilder

public class Main {
    public static void main(String[] args) {
        Product newProduct = new ProductBuilder()
                .buildProductId(1)
                .buildProductName("new product")
                .buildProductCalories(100)
                .buildProductProteins(25)
                .build();
        System.out.println(newProduct);
    }
}
