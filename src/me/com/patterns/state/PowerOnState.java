package me.com.patterns.state;

import me.com.patterns.state.interfaces.TvState;

public class PowerOnState implements TvState {

    @Override
    public void nextChannel() {
        System.out.println("Next channel.");
    }

    @Override
    public void prevChannel() {
        System.out.println("Previous channel.");
    }

    @Override
    public void turnUp() {
        System.out.println("Turn volume up.");
    }

    @Override
    public void turnDown() {
        System.out.println("Turn volume down.");
    }
}
