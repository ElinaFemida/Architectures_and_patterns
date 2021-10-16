package ru.geekbrains.architectures_and_patterns.entities;


import lombok.Data;

import java.util.LinkedList;
import java.util.List;

@Data
public class DishList extends DishComponent {
    private DishType name;
    private List<ProductItem> dishList = new LinkedList<>();

    public DishList(DishType name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name + " LIST");
        System.out.println("--------------------------------");
        dishList.forEach(DishComponent::print);
    }

    @Override
    public void addProduct(DishComponent e) {
        dishList.add((ProductItem) e);
    }

    @Override
    public void removeProduct(int index) {
        dishList.remove(index);
    }
}
