package me.com.patterns.strategy;

public class TrafficCalculator {

    private CalculateStrategy strategy;

    public TrafficCalculator(CalculateStrategy strategy) {
        this.strategy = strategy;
    }

    public void calculate(int km) {
        int price = strategy.calculatePrice(km);
        System.out.println(strategy.getName() + " price : " + price);
    }

    public void setStrategy(CalculateStrategy strategy) {
        this.strategy = strategy;
    }
}
