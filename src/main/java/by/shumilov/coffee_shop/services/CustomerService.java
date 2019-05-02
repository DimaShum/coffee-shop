package by.shumilov.coffee_shop.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import by.shumilov.coffee_shop.entity.CoffeeTypeDbo;
import by.shumilov.coffee_shop.model.CoffeeTypeDto;
import by.shumilov.coffee_shop.model.CoffeeListDto;
import by.shumilov.coffee_shop.repositories.CoffeeOrderRepository;
import by.shumilov.coffee_shop.repositories.CoffeeTypeRepository;
import by.shumilov.coffee_shop.utils.CoffeeTypeDtoDboConverter;

@Service
public class CustomerService {
    private final CoffeeTypeRepository coffeeTypeRepository;
    private final CoffeeOrderRepository coffeeOrderRepository;
    private final CoffeeTypeDtoDboConverter coffeeTypeDtoDboConverter;

    public CustomerService(CoffeeTypeRepository coffeeTypeRepository, CoffeeOrderRepository coffeeOrderRepository, by.shumilov.coffee_shop.utils.CoffeeTypeDtoDboConverter coffeeTypeDtoDboConverter) {
        this.coffeeTypeRepository = coffeeTypeRepository;
        this.coffeeOrderRepository = coffeeOrderRepository;
        this.coffeeTypeDtoDboConverter = coffeeTypeDtoDboConverter;
    }

    public CoffeeListDto retrieveCoffeeList() {
        List<CoffeeTypeDto> coffeeTypes = new ArrayList<>();
        Iterable<CoffeeTypeDbo> iterable = coffeeTypeRepository.findAll();
        iterable.forEach(coffeeTypeDbo -> coffeeTypes.add(coffeeTypeDtoDboConverter.convertToDto(coffeeTypeDbo)));
        return new CoffeeListDto(coffeeTypes);
    }
}
