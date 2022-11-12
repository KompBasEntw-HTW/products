package de.extremecoffee.products.product;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository <Product, Long> {
  
  Product findById(long id);
}
