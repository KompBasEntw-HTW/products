package de.extremecoffee.user;

import io.quarkus.security.identity.SecurityIdentity;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import java.util.Set;

import org.eclipse.microprofile.openapi.annotations.security.SecurityRequirement;
import org.jboss.resteasy.reactive.NoCache;

@Path("/users")
@SecurityRequirement(name = "Bearer Authentication")
public class UserResource {
  @Inject SecurityIdentity identity;

  @GET
  @Path("/me")
  @NoCache
  public User me() {
    return new User(identity);
  }

  public static class User {

    private final String userName;
    private final Set<String> attributes;
    private final String id;

    User(SecurityIdentity identity) {
      this.userName = identity.getPrincipal().getName();
      this.attributes = identity.getAttributes().keySet();
      this.id = identity.getAttribute("tenant-id");
    }

    public String getUserName() {
      return userName;
    }
    public Set<String> getAttributes(){
      return attributes;
    }
    public String getId(){
      return id;
    }
  }
}
