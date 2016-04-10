package me.com.patterns.proxy;

public class ProxySubject extends Subject {

    private RealSubject realSubject;

    public ProxySubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void visit() {
        System.out.println("ProxySubject visit() invoke.");
        realSubject.visit();
    }
}
