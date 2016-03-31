package me.com.patterns.mediator;

/**
 * 具体同事类
 */
public class Tenant extends Person {

    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void contract(String message) {
        mediator.contract(message, this);
    }

    public void getMessage(String message) {
        System.out.println("租房者:" + name + ", 获得信息：" + message);
    }
}
