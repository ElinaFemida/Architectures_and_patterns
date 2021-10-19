package ru.geekbrains.architectures_and_patterns;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.geekbrains.architectures_and_patterns.entities.*;
import ru.geekbrains.architectures_and_patterns.repo.ProductMapperImpl;
import ru.geekbrains.architectures_and_patterns.services.ProductBuilder;


public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        final var mapper = new ProductMapperImpl();

        Product apple = new ProductBuilder()
                .buildProductId(7L)
                .buildProductName("apple")
                .buildProductCalories(100L)
                .buildProductProteins(25L)
                .buildProductFats(0L)
                .buildProductCarbs(0L)
                .build();
        System.out.println(apple);

        Product orange = new ProductBuilder()
                .buildProductId(6L)
                .buildProductName("orange")
                .buildProductCalories(50L)
                .buildProductProteins(0L)
                .buildProductFats(0L)
                .buildProductCarbs(0L)
                .build();
        System.out.println(orange);

        Product banana = new ProductBuilder()
                .buildProductId(5L)
                .buildProductName("banana")
                .buildProductCalories(96)
                .buildProductProteins(0L)
                .buildProductFats(0L)
                .buildProductCarbs(22)
                .build();
        System.out.println(banana);

        mapper.insert(orange);
        LOGGER.debug("product is inserted");
        mapper.insert(banana);
        LOGGER.debug("product is inserted");

        mapper.find(apple.getProductId());
        LOGGER.debug(apple + ", is searched");
        mapper.find(orange.getProductId());
        LOGGER.debug(orange + ", is searched");

        mapper.update(apple);
        LOGGER.debug(apple + ", is updated");

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

