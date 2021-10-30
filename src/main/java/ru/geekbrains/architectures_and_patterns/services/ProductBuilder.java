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

/*Слепая вера
Нет проверки на входные данные от пользователя, нет проверки на наличие повторов данных в БД
Добавить проверку ignoreCase на наличие повторов данных в БД
Добавить обработку ошибок:если есть хотя бы одно из productProteins,productFats или productCarbs notNull,
productCalories тоже не может быть null
*/

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
