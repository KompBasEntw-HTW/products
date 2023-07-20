package de.extremecoffee.products.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.json.bind.annotation.JsonbTransient;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Entity
public class BagSize extends PanacheEntityBase {
	@Id
	@SequenceGenerator(name = "bagsizeSequence", sequenceName = "bagsize_sequence", allocationSize = 1, initialValue = 1)
	@GeneratedValue(generator = "bagsizeSequence")
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
