package de.extremecoffee.product;

import jakarta.json.bind.annotation.JsonbTransient;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
public class CoffeeBagSize extends PanacheEntityBase {
  @Id
  @GeneratedValue
  @Schema(readOnly = true)
  @JsonbTransient
  public Long id;

  @JsonbTransient
  @ManyToOne
  @JoinColumn(name = "coffee_id")
  public Coffee coffee;

  @ManyToOne
  @JoinColumn(name = "bagsize_id")
  public BagSize bagSize;

  @NotNull()
  public Integer quantity;
}
