# Coffee Van Loader

This Java application simulates the process of loading a van with various coffee products. The application models different types of coffee (beans, ground, instant) with attributes such as volume, price, weight, and quality. It allows sorting of coffee products based on price-to-weight ratio and searching for products within a specified quality range. The van has a limited volume, and exceptions are handled to ensure the load stays within this limit.

## Project Structure

- `Main.java`: Entry point of the program. Demonstrates loading coffee products into the van, sorting them by price-to-weight ratio, and filtering based on quality.
- `Van.java`: Class representing the van, which contains a list of loaded coffee products. Includes methods for loading coffee, sorting by price-to-weight ratio, and finding products within a quality range.
- `Coffee.java`: Abstract class defining a general coffee product with attributes for volume, price, weight, and quality. Provides a method to calculate the price-to-weight ratio.
- `CoffeeBeans.java`: Class representing coffee in bean form, extending `Coffee`.
- `GroundCoffee.java`: Class representing ground coffee, extending `Coffee`.
- `InstantCoffee.java`: Class representing instant coffee, which can be packaged in jars or sachets, extending `Coffee`.

## Features

1. **Load Coffee Products**: Adds various types of coffee to the van’s load, checking to ensure that the van's volume limit is not exceeded.
2. **Sort by Price-to-Weight Ratio**: Sorts loaded coffee products in ascending order based on their price-to-weight ratio.
3. **Filter by Quality Range**: Finds coffee products that match a specified range of quality, allowing for easy identification of higher or lower quality items.

## How to Run

### Prerequisites
1. Install the [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) version 8 or above.
2. Install [Maven](https://maven.apache.org/) or use a Java-compatible IDE like [IntelliJ IDEA](https://www.jetbrains.com/idea/) or [Eclipse](https://www.eclipse.org/ide/).

### Clone the repository
```bash
git clone https://github.com/kovaliovev/java-basic-5.git
```

### Navigate to the root directory of the project
```bash
cd java-basic-5
```

### Compile the project
```bash
javac -d out -sourcepath src src/main/java/org/example/*.java
```

### Run the project
```bash
java -cp out org.example.Main
```
