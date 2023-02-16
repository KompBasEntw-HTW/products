package de.extremecoffee;

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
    Log.info("Recieved Message: " + orderValidationRequestDto);
    Double subTotal = 0.0;
    Boolean isValid = true;
    for (var itemToValidateDto : orderValidationRequestDto.items()) {
      Coffee coffee = Coffee.findById(itemToValidateDto.productId());
      BagSize bagSize = BagSize.findById(itemToValidateDto.bagsizeId());
      // check if bagsize and coffee exist
      if (coffee == null || bagSize == null) {
        subTotal = 0.0;
        isValid = false;
        break;
      }
      Stream<CoffeeBagSize> coffeeBagSizeStream = CoffeeBagSize.streamAll();
      CoffeeBagSize coffeeBagSize = coffeeBagSizeStream
          .filter(cb -> cb.coffee.id == itemToValidateDto.productId() && cb.bagSize.id == itemToValidateDto.bagsizeId())
          .toList().get(0);
      // check if item is in stock
      if (coffeeBagSize.quantity < itemToValidateDto.quantity()) {
        subTotal = 0.0;
        isValid = false;
        break;
      }
      subTotal += calculateSingleItemPrice(coffee.pricePerKilo, bagSize.volumeDiscount, bagSize.weightInGrams)
          * itemToValidateDto.quantity();
    }
    var orderValidationDto = new OrderValidationDto(isValid, subTotal, orderValidationRequestDto.id());

    Log.info("Sending Message: " + orderValidationDto);
    orderValidationDtoEmitter.send(orderValidationDto);
  }

  private Double calculateSingleItemPrice(Double kiloPrice, Double volumeDiscount, Integer weightInGrams) {
    Log.info("kiloPrice:" + kiloPrice);
    Log.info("volumeDiscount:" + volumeDiscount);
    Log.info("weightInGrams:" + weightInGrams);
    return kiloPrice * (1 - volumeDiscount) * (weightInGrams / 1000);
  }
}
