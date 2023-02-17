package de.extremecoffee;

import de.extremecoffee.product.Coffee;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.NotFoundException;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import java.util.List;

@Path("/coffee")
public class CoffeeController {
  @GET
  public List<Coffee> getAll() {
    System.out.println("Cane");
    return Coffee.listAll();
  }

  @POST
  @Transactional
  public Coffee add(@Valid Coffee product) {
    product.persist();
    return product;
  }

  @DELETE
  @Path("/{id}")
  @Transactional
  public void delete(Long id) {
    Coffee product = Coffee.findById(id);
    if (product == null) {
      throw new NotFoundException();
    }
    product.delete();
  }

  @GET
  @Path("/{id}")
  public Coffee getById(Long id) {
    return Coffee.findById(id);
  }
}
