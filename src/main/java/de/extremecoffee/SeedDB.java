package de.extremecoffee;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import io.netty.util.internal.ThreadLocalRandom;
import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import jakarta.transaction.Transactional;

import de.extremecoffee.product.Coffee;
import de.extremecoffee.product.FlavorNote;

@ApplicationScoped
public class SeedDB {
  @Transactional
  void onStart(@Observes StartupEvent ev) {
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
}
