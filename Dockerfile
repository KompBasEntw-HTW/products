FROM gradle as build

COPY . /src

WORKDIR /src

RUN gradle build

FROM amazoncorretto:17

WORKDIR /app

COPY --from=build /src/build/libs/*.jar /app/products.jar

ENTRYPOINT [ "java", "-jar", "/app/products.jar"  ]

