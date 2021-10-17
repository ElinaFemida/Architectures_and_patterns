package ru.geekbrains.architectures_and_patterns.entities;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//mapper
public final class ProductMapperImpl implements ProductMapper {

    private final List<Product> products = new ArrayList<>();

    @Override
    public Optional<Product> find(long productId) {
        return this.products.stream().filter(x -> x.getProductId() == productId).findFirst();
    }

    @Override
    public void update(Product productToBeUpdated) throws RuntimeException {
        String name = productToBeUpdated.getProductName();
        Integer index = Optional.of(productToBeUpdated)
                .map(Product::getProductId)
                .flatMap(this::find)
                .map(products::indexOf)
                .orElseThrow(() -> new RuntimeException("Product [" + name + "] is not found"));
        products.set(index, productToBeUpdated);
    }

    @Override
    public void insert(Product productToBeInserted) throws RuntimeException {
        Optional<Product> student = find(productToBeInserted.getProductId());
        if (student.isPresent()) {
            String name = productToBeInserted.getProductName();
            throw new RuntimeException("Product already [" + name + "] exists");
        }

        products.add(productToBeInserted);
    }

    @Override
    public void delete(Product productToBeDeleted) throws RuntimeException {
        if (!products.remove(productToBeDeleted)) {
            String name = productToBeDeleted.getProductName();
            throw new RuntimeException("Product [" + name + "] is not found");
        }
    }

    public List<Product> getProducts() {
        return this.products;
    }
}