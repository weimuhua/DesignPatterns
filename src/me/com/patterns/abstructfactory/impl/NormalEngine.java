package me.com.patterns.abstructfactory.impl;

import me.com.patterns.abstructfactory.interfaces.IEngine;

/**
 * Created by wayne on 16-3-17.
 */
public class NormalEngine implements IEngine {

    @Override
    public void engine() {
        System.out.println("Normal engine.");
    }
}
