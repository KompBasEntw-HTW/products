package de.extremecoffee;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.servers.Server;

import jakarta.ws.rs.core.Application;

@OpenAPIDefinition(info = @Info(title = "Coffee API", version = "1.0.0"), servers = @Server(url = "/api/product-service"))
public class ProductApplication extends Application {

}
