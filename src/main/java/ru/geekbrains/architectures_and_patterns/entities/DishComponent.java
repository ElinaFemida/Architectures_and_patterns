package ru.geekbrains.architectures_and_patterns.entities;

//component
public abstract class DishComponent {


    public void print() {
        throw new UnsupportedOperationException();
    }

    public void addProduct(DishComponent e) {
        throw new UnsupportedOperationException();
    }

    public void removeProduct(int index) {
        throw new UnsupportedOperationException();
    }
}

