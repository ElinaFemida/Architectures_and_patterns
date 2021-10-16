package ru.geekbrains.architectures_and_patterns;

import ru.geekbrains.architectures_and_patterns.entities.*;
import ru.geekbrains.architectures_and_patterns.services.ProductBuilder;

import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Product apple = new ProductBuilder()
                .buildProductId(1)
                .buildProductName("apple")
                .buildProductCalories(100)
                .buildProductProteins(25)
                .build();
        System.out.println(apple);

        Product orange = new ProductBuilder()
                .buildProductId(2)
                .buildProductName("orange")
                .buildProductCalories(50)
                .buildProductProductCarbs(20)
                .build();
        System.out.println(orange);

        DishList breakfast = new DishList(DishType.BREAKFAST);
        breakfast.addProduct(new ProductItem(apple, 10));
        breakfast.addProduct(new ProductItem(orange, 2));
        breakfast.print();
        DishList lunch = new DishList(DishType.LUNCH);
        lunch.addProduct(new ProductItem(apple, 1));
        FoodDiary diary = new FoodDiary();
        diary.addProduct(breakfast);
        diary.addProduct(lunch);
        diary.print();

    }
}
