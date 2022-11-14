package de.extremecoffee.products.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ProductSeeder {
  @Autowired
  ProductRepository productRepository;

  Logger logger = LoggerFactory.getLogger(ProductSeeder.class);

  @EventListener(ApplicationReadyEvent.class)
  public void SeedDb() {
    var reseedDb = false;
    if (reseedDb) {
      logger.info("seeding db");
      productRepository.deleteAll();
      productRepository.save(new Product(0L, "Coffee 1", 4.4));
      productRepository.save(new Product(0L, "Coffee 2", 4.4));
      productRepository.save(new Product(0L, "Coffee 3", 4.4));
      productRepository.save(new Product(0L, "Coffee 4", 4.4));
      productRepository.save(new Product(0L, "Coffee 5", 4.4));
      productRepository.save(new Product(0L, "Coffee 6", 4.4));
      productRepository.save(new Product(0L, "Coffee 7", 4.4));
      productRepository.save(new Product(0L, "Coffee 8", 4.4));
      productRepository.save(new Product(0L, "Coffee 9", 4.4));
      productRepository.save(new Product(0L, "Coffee 10", 4.4));
      productRepository.save(new Product(0L, "Kaffee 11", 4.4));
      logger.info("db seeded");
    }
  }
}
