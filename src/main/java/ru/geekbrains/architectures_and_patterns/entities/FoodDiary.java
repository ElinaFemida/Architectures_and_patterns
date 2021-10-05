package ru.geekbrains.architectures_and_patterns.entities;

import java.util.LinkedList;
import java.util.List;

public class FoodDiary extends DishComponent{
    private List<DishComponent> diaryList = new LinkedList<>();

    @Override
    public void print() {
        System.out.println("Diary List");
        diaryList.forEach(DishComponent::print);
    }

    @Override
    public void addProduct(DishComponent e) {
        super.addProduct(e);
    }

    @Override
    public void removeProduct(int index) {
        super.removeProduct(index);
    }
}
