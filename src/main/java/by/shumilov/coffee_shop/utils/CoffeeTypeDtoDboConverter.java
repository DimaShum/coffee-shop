package by.shumilov.coffee_shop.utils;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import by.shumilov.coffee_shop.entity.CoffeeTypeDbo;
import by.shumilov.coffee_shop.model.CoffeeTypeDto;

@Component
public class CoffeeTypeDtoDboConverter implements DtoDboConverter<CoffeeTypeDto, CoffeeTypeDbo> {

    private CoffeeTypeDtoDboConverter() {}

    @Override
    public CoffeeTypeDbo convertToDbo(CoffeeTypeDto dto) {
        CoffeeTypeDbo coffeeTypeDbo = new CoffeeTypeDbo();
        BeanUtils.copyProperties(dto, coffeeTypeDbo);
        return coffeeTypeDbo;
    }

    @Override
    public CoffeeTypeDto convertToDto(CoffeeTypeDbo dbo) {
        CoffeeTypeDto coffeeTypeDto = new CoffeeTypeDto();
        BeanUtils.copyProperties(dbo, coffeeTypeDto);
        return coffeeTypeDto;
    }
}
