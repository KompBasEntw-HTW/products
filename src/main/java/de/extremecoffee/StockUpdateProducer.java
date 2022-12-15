package de.extremecoffee;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

@ApplicationScoped
public class StockUpdateProducer {

  @Inject
  @Channel("stock")
  Emitter<StockDto> emitter;

  public void send(StockDto stockDto) {
    emitter.send(stockDto);
  }
}
