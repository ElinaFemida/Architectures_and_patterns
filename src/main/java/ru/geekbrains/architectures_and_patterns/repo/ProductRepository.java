package ru.geekbrains.architectures_and_patterns.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import ru.geekbrains.architectures_and_patterns.entities.Product;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ProductRepository implements Repository<Product>  {

    private static final String QUERY_SAVE = "insert into product(id, name, productCalories, productProteins, productFats, productCarbs) values (?, ?, ?, ?, ?, ?)";

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public ProductRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Product findById(long id) {
        Product product = CreateInstance.getInstance().getIdentityMap().find(id);
        if(product == null) {
            return jdbcTemplate.query(
                    "select id, name, productCalories, productProteins, productFats, productCarbs from products where id = ?",
                    (r, i) -> Product.builder()
                            .productId(r.getLong(1))
                            .productName(r.getString(2))
                            .productCalories(r.getLong(3))
                            .productProteins(r.getLong(4))
                            .productFats(r.getLong(5))
                            .productCarbs(r.getLong(6))
                            .build(),
                    id).stream().findAny().orElse(null);
        } else {
            return product;
        }
    }

    @Override
    public Product save(Product entity) {
        return null;
    }


    public void saveProduct(List<Product> entities){
        jdbcTemplate.batchUpdate(
                QUERY_SAVE,
                new BatchPreparedStatementSetter() {

                    @Override
                    public void setValues(PreparedStatement preparedStatement, int i) throws SQLException {
                        Product product = entities.get(i);
                        preparedStatement.setLong(1, product.getProductId());
                        preparedStatement.setString(2, product.getProductName());
                        preparedStatement.setLong(3, product.getProductCalories());
                        preparedStatement.setLong(4, product.getProductProteins());
                        preparedStatement.setLong(5, product.getProductFats());
                        preparedStatement.setLong(6, product.getProductCarbs());
                    }

                    @Override
                    public int getBatchSize() {
                        return entities.size();
                    }
                }
        );
    }

    @Override
    public void update(Product entity) {
    }

    @Override
    public void delete(Product entity) {

    }
}