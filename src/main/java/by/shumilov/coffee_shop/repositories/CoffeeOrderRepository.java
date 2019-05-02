package by.shumilov.coffee_shop.repositories;

import org.springframework.data.repository.CrudRepository;

import by.shumilov.coffee_shop.entity.CoffeeOrderDbo;

public interface CoffeeOrderRepository extends CrudRepository<CoffeeOrderDbo, Integer> {
}
