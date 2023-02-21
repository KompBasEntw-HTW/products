package de.extremecoffee.products.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.json.bind.annotation.JsonbTransient;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Entity
public class BagSize extends PanacheEntityBase {
  @Id
  @GeneratedValue
  @Schema(readOnly = true)
  public Long id;

  @NotBlank(message = "Name must not be empty")
  public String name;

  @NotNull()
  public Integer weightInGrams;

  @NotNull()
  public Double volumeDiscount;

  @JsonbTransient
  @OneToMany(mappedBy = "bagSize")
  public Set<CoffeeBagSize> coffeeBagSizes = new HashSet<CoffeeBagSize>();
}
