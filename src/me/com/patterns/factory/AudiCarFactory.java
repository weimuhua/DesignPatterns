package me.com.patterns.factory;

public class AudiCarFactory extends AudiFactory {

    @Override
    public <T extends AudiCar> T createAudiCar(Class<T> clazz) {
        T car = null;
        try {
            car = clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return car;
    }
}
