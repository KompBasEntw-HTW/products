package de.extremecoffee;

import java.util.List;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.NotFoundException;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

import de.extremecoffee.product.Coffee;

@Path("/")
public class ProductController {
  @GET
  public List<Coffee> getAll() {
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
