package de.extremecoffee.products.rabbitmq;

import de.extremecoffee.products.services.ProductValidationService;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import org.eclipse.microprofile.reactive.messaging.Incoming;

import de.extremecoffee.products.dtos.OrderValidationResponseDto;
import de.extremecoffee.products.dtos.OrderValidationRequestDto;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import io.quarkus.logging.Log;
import io.smallrye.common.annotation.Blocking;
import io.vertx.core.json.JsonObject;

@Singleton
public class OrderValidationRequestReceiver {
  @Inject
  ProductValidationService productValidationService;

  @Incoming("order-validation-request")
  @Blocking
  @Transactional
  public void validateOrder(JsonObject p) {
    OrderValidationRequestDto orderValidationRequestDto = p.mapTo(OrderValidationRequestDto.class);
    Log.info("Received Message: " + orderValidationRequestDto);
    productValidationService.validateOrder(orderValidationRequestDto);
  }
}