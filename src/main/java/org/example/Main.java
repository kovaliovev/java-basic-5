package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            Van van = new Van(100.0);

            Coffee beans = new CoffeeBeans(10.0, 100.0, 5.0, 80);
            van.loadCoffee(beans);

            Coffee ground = new GroundCoffee(15.0, 80.0, 4.0, 85);
            van.loadCoffee(ground);

            Coffee instant = new InstantCoffee(5.0, 50.0, 1.5, 70);
            van.loadCoffee(instant);

            Coffee premiumBeans = new CoffeeBeans(8.0, 150.0, 3.0, 95);
            van.loadCoffee(premiumBeans);

            van.sortCoffeeByPriceToWeightRatio();
            System.out.println("Coffee products sorted by price-to-weight ratio:");
            for (Coffee coffee : van.getInventory()) {
                System.out.println(coffee.getType() + " - Price: " + coffee.price
                        + ", Weight: " + coffee.weight
                        + ", Price-to-Weight Ratio: " + coffee.getPriceToWeightRatio());
            }

            List<Coffee> qualityRangeCoffees = van.findCoffeeByQualityRange(75, 90);
            qualityRangeCoffees.forEach(coffee -> System.out.println(coffee.getType() + " - Quality: " + coffee.getQuality()));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
