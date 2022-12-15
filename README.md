# products
Product service Extreme Coffee Experience

To run in dev mode run:
```shell script
./mvnw quarkus:build
```
then docker compose in root directory including with docker compose.dev

then: 

```shell script
./mvnw quarkus:remote-dev
```
```mermaid
erDiagram
    Coffee }o -- o{ FlavorNote: has
    Coffee || -- o{ CoffeeBagSize: has
    BagSize || -- o{ CoffeeBagSize: has
    CoffeeBagSize{
       int id PK
       int coffeeId FK
       int bagSizeId FK
       int quantity
    }
    Coffee{
        int id PK
        string description
        string name
        double pricePerKilo
    }
    BagSize{
        int id PK
        string name
        int grams
        double volumeDiscount
    }
    FlavorNote{
        int id PK
        string flavorNote
    }
 ```

