package de.extremecoffee.products.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.NotBlank;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Entity
public class FlavorNote extends PanacheEntityBase {
	@Id
	@SequenceGenerator(name = "flavornoteSequence", sequenceName = "flavornote_sequence", allocationSize = 1, initialValue = 1)
	@GeneratedValue(generator = "flavornoteSequence")
	@Schema(readOnly = true)
	public Long id;

	@NotBlank(message = "FlavorNote is required")
	public String flavorNote;
}
