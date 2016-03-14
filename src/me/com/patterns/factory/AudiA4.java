package me.com.patterns.factory;

public class AudiA4 extends AudiCar {

    @Override
    public void drive() {
        System.out.println("AudiA4 drive");
    }

    @Override
    public void selfNavigation() {
        System.out.println("AudiA4 selfNavigation");
    }
}
