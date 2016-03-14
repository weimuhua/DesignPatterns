package me.com.patterns.factory;

public abstract class AudiFactory {

    public abstract <T extends AudiCar> T createAudiCar(Class<T> clazz);
}
