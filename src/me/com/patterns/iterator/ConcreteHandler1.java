package me.com.patterns.iterator;

public class ConcreteHandler1 extends Handler {

    @Override
    public void handle(String condition) {
        if (condition.equals("ConcreteHandler1")) {
            System.out.println("ConcreteHandler1 handled.");
        } else {
            next.handle(condition);
        }
    }
}
