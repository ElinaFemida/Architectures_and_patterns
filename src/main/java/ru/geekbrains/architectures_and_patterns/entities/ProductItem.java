package ru.geekbrains.architectures_and_patterns.entities;

import lombok.Data;

//Getter'ы и Setter'ы
@Data
public class ProductItem extends DishComponent{
    private Product product;
    private int amount;
    private long sumCalories;
    private long sumProteins;
    private long sumFats;
    private long sumCarbs;

    public ProductItem(Product product, int amount) {
        this.product = product;
        this.amount = amount;
        this.sumCalories = product.getProductCalories()*amount;
        this.sumProteins = product.getProductProteins()*amount;
        this.sumFats = product.getProductFats()*amount;
        this.sumCarbs = product.getProductCarbs()*amount;
    }

    @Override
    public void print() {
        System.out.printf("%s (%d грамм, %d каллорий) %n", product.getProductName(), amount*100, sumCalories);
    }
}


