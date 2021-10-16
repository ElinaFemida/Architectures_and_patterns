package ru.geekbrains.architectures_and_patterns.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.geekbrains.architectures_and_patterns.entities.DishList;
import ru.geekbrains.architectures_and_patterns.entities.FoodDiary;

@Service
@RequiredArgsConstructor
public class FoodDiaryService {

    private FoodDiary foodDiary;

    public FoodDiary addDish(DishList dishList){
        foodDiary.getDiaryList().add(dishList);
        return foodDiary;
    }

    public FoodDiary deleteDish (DishList dishList){
        foodDiary.getDiaryList().remove(dishList);
        return foodDiary;
    }
}