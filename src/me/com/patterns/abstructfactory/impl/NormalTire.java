package me.com.patterns.abstructfactory.impl;

import me.com.patterns.abstructfactory.interfaces.ITire;

public class NormalTire implements ITire {

    @Override
    public void tire() {
        System.out.println("normal tire.");
    }
}
