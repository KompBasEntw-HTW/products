package de.extremecoffee;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import de.extremecoffee.product.Product;

@Path("/")
public class ProductController {
    @GET
    public List<Product> getAll() {
        return Product.listAll();
    }

    @POST
    @Transactional
    public Product add(@Valid Product product) {
        product.persist();
        return product;
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public void delete(Long id) {
        Product product = Product.findById(id);
        if (product == null) {
            throw new NotFoundException();
        }
        product.delete();
    }
}