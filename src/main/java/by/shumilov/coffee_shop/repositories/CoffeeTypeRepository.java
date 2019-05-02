package by.shumilov.coffee_shop.repositories;

import org.springframework.data.repository.CrudRepository;

import by.shumilov.coffee_shop.entity.CoffeeTypeDbo;

public interface CoffeeTypeRepository extends CrudRepository<CoffeeTypeDbo, Integer> {
}
