package me.com.patterns.proxy;

public class RealSubject extends Subject {

    @Override
    public void visit() {
        System.out.println("RealSubject visit() invoke.");
    }
}
