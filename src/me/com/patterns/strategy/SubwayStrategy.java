package me.com.patterns.strategy;

public class SubwayStrategy implements CalculateStrategy {

    @Override
    public int calculatePrice(int km) {
        if (km <= 6) {
            return 3;
        } else if (km > 6 && km <= 12) {
            return 4;
        } else if (km > 12 && km <= 22) {
            return 5;
        } else if (km > 22 && km <= 32) {
            return 6;
        } else {
            int extraTotal = km - 32;
            if (extraTotal <= 20) {
                return 7;
            }
            int extraFactor = km / 20;
            int fraction = extraTotal % 20;
            int price = 6 + extraFactor;
            return fraction > 0 ? price + 1 : price;
        }
    }

    @Override
    public String getName() {
        return "Subway Strategy";
    }
}
