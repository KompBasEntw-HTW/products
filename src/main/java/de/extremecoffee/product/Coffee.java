package de.extremecoffee.product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotBlank;

import java.util.Set;

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

  @ManyToMany()
  public Set<BagSize> availableBagSizes;

  @ManyToMany()
  public Set<FlavorNote> flavorNotes;

  @Column(length = 400) 
  @NotBlank(message = "Description is required")
  public String description;

  @NotBlank(message = "Location is required")
  public String location;

  @NotBlank(message = "Roaster is required")
  public String roaster;

  @NotBlank(message = "ImageURL is required")
  public String imageUrl;

  @NotNull()
  public Integer roastLevel;

  @Column(length = 500) 
  public String roasterNotes;
}
