package me.com.patterns.strategy;

public class BusStrategy implements CalculateStrategy {

    @Override
    public int calculatePrice(int km) {
        int extraTotal = km - 10;

        int extraFactor = extraTotal / 5;

        int fraction = extraTotal % 5;

        int price = 1 + extraFactor;

        return fraction > 0 ? ++price : price;
    }

    @Override
    public String getName() {
        return "Bus Strategy";
    }
}
