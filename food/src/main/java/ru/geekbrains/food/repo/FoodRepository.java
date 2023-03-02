package ru.geekbrains.food.repo;

import org.springframework.data.repository.CrudRepository;
import ru.geekbrains.food.models.ObjectFood;

public interface FoodRepository extends CrudRepository<ObjectFood, Long> {
}
