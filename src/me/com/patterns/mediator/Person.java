package me.com.patterns.mediator;

/**
 * Created by wayne on 16-3-31.
 * 抽象同事对象
 */
public abstract class Person {

    protected String name;
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
