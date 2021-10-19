package ru.geekbrains.architectures_and_patterns.repo;

import ru.geekbrains.architectures_and_patterns.services.ProductBuilder;

public class CreateInstance {
    private static final CreateInstance instance = new CreateInstance();

    public static CreateInstance getInstance(){
        return instance;
    }

    protected ProductBuilder productBuilder = new ProductBuilder();

    public ProductBuilder getProductBuilder(){
        return productBuilder;
    }

    protected IdentityMap identityMap = IdentityMap.getCurrent();

    public IdentityMap getIdentityMap(){
        return identityMap;
    }

}