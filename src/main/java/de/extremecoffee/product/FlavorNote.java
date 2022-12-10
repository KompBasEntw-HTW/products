package de.extremecoffee.product;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
public class FlavorNote extends PanacheEntityBase {
  @Id
  @GeneratedValue
  @Schema(readOnly = true)
  public Long id;

  @NotBlank(message = "Name is required")
  public String flavorNote;
}
