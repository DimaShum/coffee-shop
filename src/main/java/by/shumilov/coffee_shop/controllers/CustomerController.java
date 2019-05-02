package by.shumilov.coffee_shop.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import by.shumilov.coffee_shop.model.CoffeeListDto;
import by.shumilov.coffee_shop.services.CustomerService;

@RestController("customer")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("retrieve")
    public CoffeeListDto retrieveCoffeeList() {
        return customerService.retrieveCoffeeList();
    }
}
