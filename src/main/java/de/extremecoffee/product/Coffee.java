package de.extremecoffee.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import io.smallrye.common.constraint.NotNull;

@Entity
public class Coffee extends PanacheEntityBase {
  @Id
  @GeneratedValue
  @Schema(readOnly = true)
  public Long id;

  @NotBlank(message = "Name is required")
  public String name;

  @NotNull()
  public Double price;

  @NotBlank(message = "Flavor is required")
  public String flavor;

  public String flavorNotes;

  @Column(length = 400) 
  @NotBlank(message = "Description is required")
  public String description;

  @NotBlank(message = "Location is required")
  public String location;

  @NotBlank(message = "Roaster is required")
  public String roaster;

  @NotBlank(message = "ImageURL is required")
  public String imageUrl;

  @NotBlank(message = "Roast-level is required")
  public Integer roastLevel;

  @Column(length = 500) 
  public String roasterNotes;
}
