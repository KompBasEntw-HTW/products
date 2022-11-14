package de.extremecoffee.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import de.extremecoffee.products.product.Product;
import de.extremecoffee.products.product.ProductRepository;
import jakarta.validation.Valid;

@RestController
public class ProductsController {
  @Autowired
  ProductRepository productRepository;

  @GetMapping("/")
  List<Product> all() {
    return productRepository.findAll();
  }

  @PostMapping("/")
  Product newProduct(@Valid @RequestBody Product newProduct) {
    return productRepository.save(newProduct);
  }

  @DeleteMapping("/{id}")
  void deleteProduct(@PathVariable Long id) {
    productRepository.deleteById(id);
  }
}