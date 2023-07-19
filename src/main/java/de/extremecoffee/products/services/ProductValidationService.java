package de.extremecoffee.products.services;

import de.extremecoffee.products.dtos.ItemToValidateDto;
import de.extremecoffee.products.dtos.OrderValidationRequestDto;
import de.extremecoffee.products.dtos.OrderValidationResponseDto;
import de.extremecoffee.products.entities.BagSize;
import de.extremecoffee.products.entities.Coffee;
import de.extremecoffee.products.entities.CoffeeBagSize;
import de.extremecoffee.products.rabbitmq.OrderValidationResponseEmitter;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;


@ApplicationScoped
public class ProductValidationService {
  @Inject
  OrderValidationResponseEmitter orderValidationResponseEmitter;

  record SingleItemValidationResult(boolean isValid, String message, Double itemPrice) {
  }

  @Transactional
  public void validateOrder(OrderValidationRequestDto orderValidationRequestDto) {
    double subTotal = 0d;
    SingleItemValidationResult lastSingleItemValidationResult = null;
    for (var itemToValidateDto : orderValidationRequestDto.items()) {
      lastSingleItemValidationResult = validateSingleItem(itemToValidateDto);
      if (!lastSingleItemValidationResult.isValid()) {
        break;
      }
      subTotal += lastSingleItemValidationResult.itemPrice();
    }
    if (lastSingleItemValidationResult == null || !lastSingleItemValidationResult.isValid()) {
      var orderValidationResponseDto = new OrderValidationResponseDto(false, 0d, orderValidationRequestDto.id(), lastSingleItemValidationResult.message());
      orderValidationResponseEmitter.dispatchValidationResponse(orderValidationResponseDto);
    } else {
      removeItemsFromStock(orderValidationRequestDto);
      var orderValidationResponseDto = new OrderValidationResponseDto(true, subTotal, orderValidationRequestDto.id(), lastSingleItemValidationResult.message());
      orderValidationResponseEmitter.dispatchValidationResponse(orderValidationResponseDto);
    }
  }

  private void removeItemsFromStock(OrderValidationRequestDto orderValidationRequestDto) {
    for (var itemToValidateDto : orderValidationRequestDto.items()) {
      var coffeeBagSize = CoffeeBagSize.getByBagSizeIdandProductId(itemToValidateDto.bagsizeId(), itemToValidateDto.productId());
      coffeeBagSize.quantity -= itemToValidateDto.quantity();
    }
  }

  private SingleItemValidationResult validateSingleItem(ItemToValidateDto itemToValidateDto) {
    Coffee coffee = Coffee.findById(itemToValidateDto.productId());
    BagSize bagSize = BagSize.findById(itemToValidateDto.bagsizeId());
    // check if bagsize and coffee exist
    if (bagSize == null) {
      return new SingleItemValidationResult(false, "Coffee with specified id: " + itemToValidateDto.bagsizeId() + " does not exist", 0d);
    }
    if (coffee == null) {
      return new SingleItemValidationResult(false, "Coffee with specified id: " + itemToValidateDto.productId() + " does not exist", 0d);
    }
    var coffeeBagSize = CoffeeBagSize.getByBagSizeIdandProductId(itemToValidateDto.bagsizeId(), itemToValidateDto.productId());
    // check if item is in stock
    if (coffeeBagSize.quantity < itemToValidateDto.quantity()) {
      return new SingleItemValidationResult(false, "Item not in stock in specified quantity", 0d);
    }
    // calculate item price
    double itemPrice = calculateSingleItemPrice(coffee.pricePerKilo, bagSize.volumeDiscount, bagSize.weightInGrams, itemToValidateDto.quantity());
    return new SingleItemValidationResult(true, "OrderItem valid", itemPrice);
  }

  private double calculateSingleItemPrice(double kiloPrice, double volumeDiscount, int weightInGrams, int quantity) {
    var rawPrice = kiloPrice * (1 - volumeDiscount) * (weightInGrams / 1000d);
    return (Math.floor(rawPrice * 10) / 10.0) * quantity;
  }
}
