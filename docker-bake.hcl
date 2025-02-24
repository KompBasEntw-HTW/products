variable "TAG" {
  default = "latest"
}

group "default" {
  targets = ["product-service"]
}

target "product-service" {
  dockerfile = "./src/main/docker/Dockerfile.jvm"
  tags       = ["localhost:7000/product-service:${TAG}", "localhost:7000/product-service:latest"]
}
