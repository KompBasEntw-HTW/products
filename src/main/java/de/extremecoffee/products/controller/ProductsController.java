package de.extremecoffee.products.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.extremecoffee.products.product.Product;
import de.extremecoffee.products.product.ProductRepository;

import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class ProductsController {
  @Autowired
  ProductRepository productRepository;

  @RequestMapping(value = "products", method = RequestMethod.GET)
  public ResponseEntity<List<Product>> products() {
    var products = new ArrayList<Product>();
    productRepository.findAll().forEach(products::add);
    return new ResponseEntity<>(products, HttpStatus.OK);
  }
}