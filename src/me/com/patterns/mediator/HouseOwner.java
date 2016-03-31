package me.com.patterns.mediator;

/**
 * 具体同事类
 */
public class HouseOwner extends Person {

    public HouseOwner(String string, Mediator mediator) {
        super(string, mediator);
    }

    public void contract(String msg) {
        mediator.contract(msg, this);
    }

    public void getMessage(String msg) {
        System.out.println("房主:" + name + ", 获得信息：" + msg);
    }
}
