package me.com.patterns.chainofresponsibility;

public class ConcreteHandler2 extends Handler {

    @Override
    public void handle(String condition) {
        if (condition.equals("ConcreteHandler2")) {
            System.out.println("ConcreteHandler2 handled");
        } else {
            next.handle(condition);
        }
    }
}
