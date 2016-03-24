package me.com.patterns.state;

import me.com.patterns.state.interfaces.PowerState;
import me.com.patterns.state.interfaces.TvState;

public class TvController implements PowerState {

    private TvState mTvState = new PowerOffState();

    public void setTvState(TvState tvState) {
        mTvState = tvState;
    }

    @Override
    public void powerOn() {
        System.out.println("The TV is on.");
    }

    @Override
    public void powerOff() {
        mTvState = new PowerOffState();
        System.out.println("The TV is off.");
    }

    public void nextChannel() {
        mTvState.nextChannel();
    }

    public void prevChannel() {
        mTvState.prevChannel();
    }

    public void turnUp() {
        mTvState.turnUp();
    }

    public void turnDown() {
        mTvState.turnDown();
    }
}
