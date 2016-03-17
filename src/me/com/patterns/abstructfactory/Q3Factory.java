package me.com.patterns.abstructfactory;

import me.com.patterns.abstructfactory.impl.NormalEngine;
import me.com.patterns.abstructfactory.impl.NormalTire;
import me.com.patterns.abstructfactory.interfaces.IEngine;
import me.com.patterns.abstructfactory.interfaces.ITire;

public class Q3Factory extends CarFactory {

    @Override
    public ITire createTire() {
        return new NormalTire();
    }

    @Override
    public IEngine createEngine() {
        return new NormalEngine();
    }
}
