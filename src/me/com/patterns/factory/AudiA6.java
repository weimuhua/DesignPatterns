package me.com.patterns.factory;

public class AudiA6 extends AudiCar {

    @Override
    public void drive() {
        System.out.println("AudiA6 drive");
    }

    @Override
    public void selfNavigation() {
        System.out.println("AudiA6 selfNavigation");
    }
}
