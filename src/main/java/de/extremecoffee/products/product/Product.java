package de.extremecoffee.products.product;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Getter
  private Long id;

  @Getter
  private String name;

  @Getter
  private Double price;

  protected Product() {
  }

  public Product(String name, Double price) {
    this.name = name;
    this.price = price;
  }
}
