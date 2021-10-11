create table products
(
    productId       bigserial primary key,
    productName     varchar(255),
    productCalories bigserial,
    productProteins bigserial,
    productFats     bigserial,
    productCarbs    bigserial


);

insert into products (productName, productCalories, productProteins, productFats, productCarbs)
values ('Bread', 259, 7.7, 3,50.1),
       ('Milk 3.2%', 64, 2.8, 3.2, 4.7),
       ('Apple', 52, 0.26, 0.17, 11.41),
       ('Orange', 43, 0.9, 0.2, 8.1);