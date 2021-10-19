package ru.geekbrains.architectures_and_patterns.repo;

import ru.geekbrains.architectures_and_patterns.entities.Product;

import java.util.Map;
import java.util.HashMap;

public class IdentityMap {
    private static final ThreadLocal<IdentityMap> current = new ThreadLocal<>();

    public static void init(){
        current.set(new IdentityMap());
    }

    public static IdentityMap getCurrent(){
        return current.get();
    }

    private Map<Long, Product> entities = new HashMap<>();

    public Product find(long id){
        return entities.get(id);
    }

    public void add(Product product){
        entities.put(product.getProductId(), product);
    }

    public void remove(Product product){
        entities.remove(product.getProductId(), product);
    }

    public void clear(){
        entities.clear();
    }
}
