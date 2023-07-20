package de.extremecoffee.products.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import io.smallrye.common.constraint.NotNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.NotBlank;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Entity
public class Coffee extends PanacheEntityBase {
	@Id
	@SequenceGenerator(name = "coffeeSequence", sequenceName = "coffee_sequence", allocationSize = 1, initialValue = 1)
	@GeneratedValue(generator = "coffeeSequence")
	@Schema(readOnly = true)
	public Long id;

	@NotBlank(message = "Name is required")
	public String name;

	@NotNull()
	public Double pricePerKilo;

	@NotBlank(message = "Flavor is required")
	public String flavor;

	@OneToMany(mappedBy = "coffee")
	public Set<CoffeeBagSize> coffeeBagSizes = new HashSet<CoffeeBagSize>();

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
