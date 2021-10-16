package ru.geekbrains.architectures_and_patterns.services;

//iterator
public class CalculatorService {

    public void calculateCalories(Calculator calculator) {
        while (calculator.hasNext()) {
            long sum = 0L;
            sum += calculator.next().getSumCalories();
            System.out.println(sum);
        }
    }
}
