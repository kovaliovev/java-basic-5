package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Van {
    private final double maxVolume;
    private final List<Coffee> inventory;

    public Van(double maxVolume) {
        if (maxVolume <= 0) {
            throw new IllegalArgumentException("Max volume must be positive.");
        }
        this.maxVolume = maxVolume;
        this.inventory = new ArrayList<>();
    }

    public void loadCoffee(Coffee coffee) throws Exception {
        if (getCurrentVolume() + coffee.volume > maxVolume) {
            throw new Exception("Not enough space in the van for this coffee.");
        }
        inventory.add(coffee);
    }

    public double getCurrentVolume() {
        return inventory.stream().mapToDouble(coffee -> coffee.volume).sum();
    }

    public void sortCoffeeByPriceToWeightRatio() {
        inventory.sort(Comparator.comparingDouble(Coffee::getPriceToWeightRatio));
    }

    public List<Coffee> findCoffeeByQualityRange(int minQuality, int maxQuality) {
        List<Coffee> result = new ArrayList<>();
        for (Coffee coffee : inventory) {
            if (coffee.getQuality() >= minQuality && coffee.getQuality() <= maxQuality) {
                result.add(coffee);
            }
        }
        return result;
    }

    public List<Coffee> getInventory() {
        return inventory;
    }
}