package me.com.patterns;

import me.com.patterns.abstructfactory.CarFactory;
import me.com.patterns.abstructfactory.Q3Factory;
import me.com.patterns.abstructfactory.Q7Factory;
import me.com.patterns.builder.NutritionFacts;
import me.com.patterns.factory.*;
import me.com.patterns.state.PowerOnState;
import me.com.patterns.state.TvController;
import me.com.patterns.strategy.BusStrategy;
import me.com.patterns.strategy.SubwayStrategy;
import me.com.patterns.strategy.TrafficCalculator;

public class Test {

    public static void main(String[] args) {
        System.out.println("Hello IntelliJ Idea!");

        /** 建造者模式 */
        testBuilder();

        /** 简单工厂模式 */
        testFactory();

        /** 抽象工厂模式 */
        testAbstractFactory();

        /** 策略模式 */
        testStrategyPattern();

        /** 状态模式 */
        testStatePattern();

        /** 迭代器模式 */
        testIteratorPattern();
    }

    /**
     * 建造者模式
     * 适用于构造参数过多的对象时使用
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
     * 简单工厂模式
     * 优点：将对象的创建统一起来有利于维护和整体把控，对扩展开放，对修改封闭
     * 对象的创建和对象本身业务处理分离可以降低系统的耦合度
     * <p>
     * 缺点：工厂类集中了所有产品创建逻辑，一旦不能正常工作，整个系统都要受到影响
     * 使用简单工厂模式将会增加系统中类的个数，在一定程序上增加了系统的复杂度和理解难度
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

    /**
     * 抽象工厂模式
     */
    private static void testAbstractFactory() {
        CarFactory q3Factory = new Q3Factory();
        System.out.println("produce Q3");
        q3Factory.createTire().tire();
        q3Factory.createEngine().engine();

        CarFactory q7Factory = new Q7Factory();
        System.out.println("produce Q7");
        q7Factory.createTire().tire();
        q7Factory.createEngine().engine();

        System.out.println();
    }

    /**
     * 策略模式
     * 策略模式主要用来抽象在相同的行为下不同的具体视线，很好地演示了开闭原则。
     * <p>
     * 优点：结构清晰明了，耦合度低，便于扩展
     * 缺点：随着策略增多，子类的数量会增多
     */
    private static void testStrategyPattern() {
        TrafficCalculator calculator = new TrafficCalculator(new SubwayStrategy());
        calculator.calculate(50);

        calculator.setStrategy(new BusStrategy());
        calculator.calculate(50);

        System.out.println();
    }

    /**
     * 状态模式
     * 当一个对象的行为取决于它的状态时，代码中包含大量与对象状态有关的条件语句时，可以考虑使用状态模式
     * <p>
     * 状态模式的使用会增加类和对象的个数
     */
    private static void testStatePattern() {
        TvController controller = new TvController();

        controller.setTvState(new PowerOnState());
        controller.powerOn();
        controller.nextChannel();
        controller.prevChannel();
        controller.turnUp();
        controller.turnUp();

        controller.powerOff();
        controller.nextChannel();
        controller.prevChannel();
        controller.turnUp();
        controller.turnUp();
    }

    /**
     * 迭代器模式
     * 多个对象可以处理同一请求,具体由哪个对象处理则在运行时动态决定
     */
    private static void testIteratorPattern() {

    }
}
