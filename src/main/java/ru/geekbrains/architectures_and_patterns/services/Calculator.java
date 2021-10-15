package ru.geekbrains.architectures_and_patterns.services;

//iterator
import ru.geekbrains.architectures_and_patterns.entities.DishList;
import ru.geekbrains.architectures_and_patterns.entities.ProductItem;

public class Calculator implements Iterator {
    private int count = 0;
    private DishList dishList;

    public Calculator(DishList dishList) {
        this.dishList = dishList;
    }

    @Override
    public boolean hasNext() {
        return count < dishList.getDishList().size();
    }

    @Override
    public ProductItem next() {
        return dishList.getDishList().get(count++);
    }
}
