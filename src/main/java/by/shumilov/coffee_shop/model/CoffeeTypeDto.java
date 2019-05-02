package by.shumilov.coffee_shop.model;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class CoffeeTypeDto {
    private long id;
    @NotNull
    private String name;
    private double price;
}
