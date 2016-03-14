package me.com.patterns;

import me.com.patterns.builder.NutritionFacts;
import me.com.patterns.factory.*;

public class Test {

    public static void main(String[] args) {
        System.out.println("Hello IntelliJ Idea!");

        testBuilder();

        testFactory();
    }

    /**
     * 建造者模式
     */
    private static void testBuilder() {
        NutritionFacts nutritionFacts
                = new NutritionFacts.Builder(5, 10)
                .setCalories(3).setCarbohydrate(4)
                .setFat(5).setSodium(6).build();
        System.out.println(nutritionFacts.toString());
        System.out.println();
    }

    /**
     * 工厂模式
     */
    private static void testFactory() {
        AudiFactory factory = new AudiCarFactory();

        AudiCar A4 = factory.createAudiCar(AudiA4.class);
        A4.drive();
        A4.selfNavigation();

        AudiCar A6 = factory.createAudiCar(AudiA6.class);
        A6.drive();
        A6.selfNavigation();

        System.out.println();
    }
}
