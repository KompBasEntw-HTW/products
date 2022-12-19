package de.extremecoffee;

import de.extremecoffee.product.BagSize;
import de.extremecoffee.product.Coffee;
import de.extremecoffee.product.CoffeeBagSize;
import de.extremecoffee.product.FlavorNote;
import io.netty.util.internal.ThreadLocalRandom;
import io.quarkus.runtime.StartupEvent;
import io.quarkus.scheduler.Scheduled;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

@ApplicationScoped
public class SeedDB {
  @Inject StockUpdateProducer stockUpdateProducer;

  @Scheduled(cron = "0 */2 * ? * *")
  void transmitStockState() {
    publishStock();
  }

  @Transactional
  void startSeed(@Observes StartupEvent ev) {
    assignFlavorNotes();
    assignBagSizes();
    publishStock();
  }

  private void assignFlavorNotes() {
    List<Coffee> coffees = Coffee.listAll();
    List<FlavorNote> flavorNotes = FlavorNote.listAll();
    for (var coffee : coffees) {
      Collections.shuffle(flavorNotes);
      var numberOfFlavorNotes = ThreadLocalRandom.current().nextInt(1, 5);
      var flavorNotesForCoffee = flavorNotes.subList(0, numberOfFlavorNotes);
      coffee.flavorNotes = new HashSet<FlavorNote>(flavorNotesForCoffee);
      coffee.persist();
    }
  }

  private void assignBagSizes() {
    List<Coffee> coffees = Coffee.listAll();
    List<BagSize> bagSizes = BagSize.listAll();
    for (var coffee : coffees) {
      for (var bagSize : bagSizes) {
        var coffeeBagSize = new CoffeeBagSize();
        coffeeBagSize.coffee = coffee;
        coffeeBagSize.bagSize = bagSize;
        coffeeBagSize.quantity = ThreadLocalRandom.current().nextInt(0, 8);
        coffeeBagSize.persist();
        coffee.coffeeBagSizes.add(coffeeBagSize);
      }
      coffee.persist();
    }
  }

  private void publishStock() {
    List<CoffeeBagSize> coffeeBagSizes = CoffeeBagSize.listAll();
    for (var coffeeBagSize : coffeeBagSizes) {
      var stockDto =
          new StockDto(coffeeBagSize.coffee.id, coffeeBagSize.bagSize.id, coffeeBagSize.quantity);
      stockUpdateProducer.send(stockDto);
    }
  }
}
