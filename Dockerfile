FROM gradle as build

COPY . /src

WORKDIR /src

RUN gradle build

FROM openjdk:17-jdk-slim

WORKDIR /app

COPY --from=build /src/build/libs/*.jar /app/products.jar

ENTRYPOINT [ "java", "-jar", "/app/products.jar"  ]

