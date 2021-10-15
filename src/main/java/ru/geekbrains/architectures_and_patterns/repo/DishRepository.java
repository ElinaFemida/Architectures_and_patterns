package ru.geekbrains.architectures_and_patterns.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import ru.geekbrains.architectures_and_patterns.entities.DishList;

@Repository
public interface DishRepository extends JpaRepository<DishList, Long>, JpaSpecificationExecutor<DishList> {


}
