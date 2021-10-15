package ru.geekbrains.architectures_and_patterns.services;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.geekbrains.architectures_and_patterns.entities.DishList;
import ru.geekbrains.architectures_and_patterns.entities.ProductItem;


@Service
@RequiredArgsConstructor
public class DishListService {

    private DishList dishList;

    public DishList addProduct(ProductItem product){
        dishList.getDishList().add(product);
        return dishList;
    }

    public DishList deleteProduct (ProductItem product){
        dishList.getDishList().remove(product);
        return dishList;
    }

}