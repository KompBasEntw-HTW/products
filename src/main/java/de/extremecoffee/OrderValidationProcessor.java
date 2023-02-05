package de.extremecoffee;

import java.util.List;

import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Outgoing;

import de.extremecoffee.product.BagSize;
import de.extremecoffee.product.Coffee;
import jakarta.enterprise.context.ApplicationScoped;
import io.quarkus.logging.Log;

@ApplicationScoped
public class OrderValidationProcessor {

  record ItemToValidateDto(Long bagsizeId, Long productId, Integer quantity) {
  }

  record OrderValidationRequestDto(List<ItemToValidateDto> items, Long id) {
  }

  record OrderValidationDto(Boolean isValid, Double subTotal, Long id) {
  }

  @Incoming("order-validation-request")
  @Outgoing("order-validation")
  public OrderValidationDto validateOrder(OrderValidationRequestDto orderValidationRequestDto) {
    Double subTotal = 0.0;
    Boolean isValid = true;
    for (var itemToValidateDto : orderValidationRequestDto.items()) {
      Coffee coffee = Coffee.findById(itemToValidateDto.productId());
      BagSize bagSize = BagSize.findById(itemToValidateDto.bagsizeId());
      subTotal += calculateSingleItemPrice(coffee.pricePerKilo, bagSize.volumeDiscount, bagSize.weightInGrams)
          * itemToValidateDto.quantity();
    }
    Log.info("Recieved Message: " + orderValidationRequestDto);
    var orderValidationDto = new OrderValidationDto(isValid, subTotal, orderValidationRequestDto.id());

    Log.info("Sending Message: " + orderValidationDto);
    return orderValidationDto;
  }

  private Double calculateSingleItemPrice(Double kiloPrice, Double volumeDiscount, Integer weightInGrams) {
    return kiloPrice * (1 - volumeDiscount) * (weightInGrams / 1000);
  }
}
