package de.extremecoffee.products.rabbitmq;

import de.extremecoffee.products.dtos.OrderValidationResponseDto;
import io.quarkus.logging.Log;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

@ApplicationScoped
public class OrderValidationResponseEmitter {
  @Channel("order-validation")
  Emitter<OrderValidationResponseDto> orderValidationDtoEmitter;
  public void dispatchValidationResponse(OrderValidationResponseDto orderValidationResponseDto) {
    Log.info("Sending Message: " + orderValidationResponseDto);
    orderValidationDtoEmitter.send(orderValidationResponseDto);
  }
}
