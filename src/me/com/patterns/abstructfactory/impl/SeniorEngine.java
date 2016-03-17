package me.com.patterns.abstructfactory.impl;

import me.com.patterns.abstructfactory.interfaces.IEngine;

public class SeniorEngine implements IEngine {

    @Override
    public void engine() {
        System.out.println("Senior engine.");
    }
}
