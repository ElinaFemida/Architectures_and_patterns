package ru.geekbrains.architectures_and_patterns.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import ru.geekbrains.architectures_and_patterns.entities.FoodDiary;

@Repository

public interface FoodDiaryRepository extends JpaRepository<FoodDiary, Long>, JpaSpecificationExecutor<FoodDiary> {
}
