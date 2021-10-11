package ru.geekbrains.architectures_and_patterns.services;

public class Calculator implements Iterator {
    private int count = 0;
    private Object[] objects = null;

    public Calculator(Object[] objects) {
        this.objects = objects;
    }

    @Override
    public boolean hasNext() {
        return count < objects.length;
    }

    @Override
    public Object next() {
        return objects[count++];
    }
}
