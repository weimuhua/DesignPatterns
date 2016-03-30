package me.com.patterns;

import me.com.patterns.abstructfactory.CarFactory;
import me.com.patterns.abstructfactory.Q3Factory;
import me.com.patterns.abstructfactory.Q7Factory;
import me.com.patterns.builder.NutritionFacts;
import me.com.patterns.command.*;
import me.com.patterns.factory.*;
import me.com.patterns.chainofresponsibility.ConcreteHandler1;
import me.com.patterns.chainofresponsibility.ConcreteHandler2;
import me.com.patterns.memento.CallOnDuty;
import me.com.patterns.memento.Caretaker;
import me.com.patterns.state.PowerOnState;
import me.com.patterns.state.TvController;
import me.com.patterns.strategy.BusStrategy;
import me.com.patterns.strategy.SubwayStrategy;
import me.com.patterns.strategy.TrafficCalculator;

public class Test {

    public static void main(String[] args) {
        System.out.println("Hello IntelliJ Idea!");

        /** 单例模式，使用场景较多,比较熟悉，不具体实现并测试 */

        /** 建造者模式 */
        testBuilder();

        /** 原型模式，使用场景较少，不具体实现并测试,见WordDocument.java */

        /** 简单工厂模式 */
        testFactory();

        /** 抽象工厂模式 */
        testAbstractFactory();

        /** 策略模式 */
        testStrategyPattern();

        /** 状态模式 */
        testStatePattern();

        /** 迭代器模式 */
        testChainOfResponsibilityPattern();

        /** 解释器模式，使用场景较少，不具体实现并测试 */

        /** 命令模式 */
        testCommandPattern();

        /** 观察者模式，Android中很常见,比较熟悉,不具体实现并测试 */

        /** 备忘录模式 */
        testMementoPattern();

        /**
         * 迭代器模式，用于访问容器。
         * 容器类不仅要维护自身内部的数据元素而且还要对外提供遍历的接口方法
         * 因为遍历状态的存储问题还不能对同一个容器进行多个遍历
         * 迭代器模式就为了解决以上问题的
         */

        /** 模板方法模式，工作中较常见，比较熟悉，不具体实现并测试 */
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

        System.out.println();
    }

    /**
     * 责任链模式
     * 多个对象可以处理同一请求,具体由哪个对象处理则在运行时动态决定
     * 可以对请求者和处理者关系解耦，提高代码灵活性
     * <p>
     * 缺点在于需要对链中请求处理者进行遍历，如果处理者太多则会影响性能
     */
    private static void testChainOfResponsibilityPattern() {
        ConcreteHandler1 handler1 = new ConcreteHandler1();
        ConcreteHandler2 handler2 = new ConcreteHandler2();

        handler1.next = handler2;
        handler2.next = handler1;

        handler1.handle("ConcreteHandler2");

        System.out.println();
    }

    /**
     * Command Pattern, 命令模式
     * 将一个请求封装成一个对象，从而让用户使用不同的请求把客户端参数化
     * <p>
     * 缺点：大量的衍生类的创建，个人感觉：华而不实
     */
    private static void testCommandPattern() {
        TetrisMachine machine = new TetrisMachine();
        Buttons button = new Buttons(new LeftCommand(machine), new RightCommand(machine),
                new FallCommand(machine), new TransformCommand(machine));
        button.toLeft();
        button.toRight();
        button.transformCommand();
        button.fallCommand();

        System.out.println();
    }

    /**
     * Memento Pattern, 备忘录模式
     */
    private static void testMementoPattern() {
        CallOnDuty game = new CallOnDuty();
        game.play();

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(game.createMemento());

        game.quit();

        CallOnDuty newGame = new CallOnDuty();
        newGame.restore(caretaker.getMemento());

        System.out.println();
    }
}
