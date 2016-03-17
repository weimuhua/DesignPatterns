package me.com.patterns.abstructfactory;

import me.com.patterns.abstructfactory.interfaces.IEngine;
import me.com.patterns.abstructfactory.interfaces.ITire;

public abstract class CarFactory {

    public abstract ITire createTire();

    public abstract IEngine createEngine();
}
