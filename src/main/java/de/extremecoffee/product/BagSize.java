
package de.extremecoffee.product;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

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

}
