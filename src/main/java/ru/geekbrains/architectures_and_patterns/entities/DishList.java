package ru.geekbrains.architectures_and_patterns.entities;


import java.util.LinkedList;
import java.util.List;

public class DishList extends DishComponent {
    private DishType name;
    private List<DishComponent> dishList = new LinkedList<>();

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
        dishList.add(e);
    }

    @Override
    public void removeProduct(int index) {
        dishList.remove(index);
    }
}
