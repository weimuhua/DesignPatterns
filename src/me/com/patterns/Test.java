package me.com.patterns;

import me.com.patterns.builder.NutritionFacts;

public class Test {

    public static void main(String[] args) {
        System.out.println("Hello IntelliJ Idea!");

        testBuilder();
    }

    private static void testBuilder() {
        NutritionFacts nutritionFacts
                = new NutritionFacts.Builder(5, 10)
                .setCalories(3).setCarbohydrate(4)
                .setFat(5).setSodium(6).build();
        System.out.printf(nutritionFacts.toString());
    }
}
