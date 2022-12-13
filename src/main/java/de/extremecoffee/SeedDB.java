package de.extremecoffee;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import io.netty.util.internal.ThreadLocalRandom;
import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import jakarta.transaction.Transactional;
import de.extremecoffee.product.BagSize;
import de.extremecoffee.product.Coffee;
import de.extremecoffee.product.CoffeeBagSize;
import de.extremecoffee.product.FlavorNote;

@ApplicationScoped
public class SeedDB {
  @Transactional
  void startSeed(@Observes StartupEvent ev) {
    assignFlavorNotes();
    assignBagSizes();
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
}
