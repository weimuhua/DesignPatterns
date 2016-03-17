package me.com.patterns.abstructfactory;

import me.com.patterns.abstructfactory.impl.SeniorEngine;
import me.com.patterns.abstructfactory.impl.SeniorTire;
import me.com.patterns.abstructfactory.interfaces.IEngine;
import me.com.patterns.abstructfactory.interfaces.ITire;

public class Q7Factory extends CarFactory {

    @Override
    public ITire createTire() {
        return new SeniorTire();
    }

    @Override
    public IEngine createEngine() {
        return new SeniorEngine();
    }
}
