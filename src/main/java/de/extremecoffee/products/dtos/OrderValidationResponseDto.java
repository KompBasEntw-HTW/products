package de.extremecoffee.products.dtos;

public record OrderValidationResponseDto(Boolean isValid, Double subTotal, Long id, String message) {
}
