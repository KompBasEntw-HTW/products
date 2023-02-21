package de.extremecoffee.products.dtos;

public record OrderValidationRequestDto(ItemToValidateDto[] items, Long id) {
}
