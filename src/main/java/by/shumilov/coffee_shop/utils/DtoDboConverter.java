package by.shumilov.coffee_shop.utils;

public interface DtoDboConverter<T, B> {

    B convertToDbo(final T dto);

    T convertToDto(final B dbo);
}
