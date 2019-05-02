package by.shumilov.coffee_shop.model;

import java.util.List;

import javax.validation.constraints.NotNull;

import lombok.Value;

@Value
public class CoffeeListDto {
    @NotNull
    private List<CoffeeTypeDto> coffeeTypes;
}
