package de.extremecoffee;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import org.eclipse.microprofile.reactive.messaging.Incoming;

import de.extremecoffee.dtos.OrderValidationDto;
import de.extremecoffee.dtos.OrderValidationRequestDto;
import de.extremecoffee.product.BagSize;
import de.extremecoffee.product.Coffee;
import de.extremecoffee.product.CoffeeBagSize;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import io.quarkus.logging.Log;
import io.smallrye.common.annotation.Blocking;
import io.vertx.core.json.JsonObject;

@ApplicationScoped
public class OrderValidationProcessor {
  @Channel("order-validation")
  Emitter<OrderValidationDto> orderValidationDtoEmitter;

  @Incoming("order-validation-request")
  @Blocking
  @Transactional
  public void validateOrder(JsonObject p) {
    OrderValidationRequestDto orderValidationRequestDto = p.mapTo(OrderValidationRequestDto.class);
    Log.info("Received Message: " + orderValidationRequestDto);
    double subTotal = 0.0;
    Map<CoffeeBagSize, Integer> bagSizeLostQuantity = new HashMap<>();
    for (var itemToValidateDto : orderValidationRequestDto.items()) {
      Coffee coffee = Coffee.findById(itemToValidateDto.productId());
      BagSize bagSize = BagSize.findById(itemToValidateDto.bagsizeId());
      // check if bagsize and coffee exist
      if (bagSize == null) {
        String message = "Bagsize with id: " + itemToValidateDto.bagsizeId() + " does not exits";
        dispatchValidationResult(false, 0.0, orderValidationRequestDto.id(), message);
        return;
      }
      if (coffee == null) {
        String message = "Coffee with specified id: " + itemToValidateDto.productId() + " does not exist";
        dispatchValidationResult(false, 0.0, orderValidationRequestDto.id(), message);
        return;
      }
      Stream<CoffeeBagSize> coffeeBagSizeStream = CoffeeBagSize.streamAll();
      CoffeeBagSize coffeeBagSize = coffeeBagSizeStream
              .filter(cb -> cb.coffee.id.equals(itemToValidateDto.productId()) && cb.bagSize.id.equals(itemToValidateDto.bagsizeId()))
              .toList().get(0);
      // check if item is in stock
      if (coffeeBagSize.quantity < itemToValidateDto.quantity()) {
        String message = "Item not in stock in specified quantity";
        dispatchValidationResult(false, 0.0, orderValidationRequestDto.id(), message);
        return;
      }
      bagSizeLostQuantity.put(coffeeBagSize, itemToValidateDto.quantity());
      subTotal += calculateSingleItemPrice(coffee.pricePerKilo, bagSize.volumeDiscount, bagSize.weightInGrams)
              * itemToValidateDto.quantity();
    }
    for (var coffeeBagSize : bagSizeLostQuantity.keySet()) {
      coffeeBagSize.quantity = coffeeBagSize.quantity - bagSizeLostQuantity.get(coffeeBagSize);
    }
    dispatchValidationResult(true, subTotal, orderValidationRequestDto.id(), "Validation successfull");
  }

  private void dispatchValidationResult(boolean validationStatus, double subTotal, long orderId, String message) {
    var orderValidationDto = new OrderValidationDto(validationStatus, subTotal, orderId);

    Log.info("Sending Message: " + orderValidationDto);
    orderValidationDtoEmitter.send(orderValidationDto);
  }

  private double calculateSingleItemPrice(double kiloPrice, double volumeDiscount, int weightInGrams) {
    Log.info("kiloPrice:" + kiloPrice);
    Log.info("volumeDiscount:" + volumeDiscount);
    Log.info("weightInGrams:" + weightInGrams);
    return kiloPrice * (1 - volumeDiscount) * (weightInGrams / 1000d);
  }
}