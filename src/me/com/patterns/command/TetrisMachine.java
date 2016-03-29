package me.com.patterns.command;

public class TetrisMachine {

    public void toLeft() {
        System.out.println("to left.");
    }

    public void toRight() {
        System.out.println("to right.");
    }

    public void fastToBottom() {
        System.out.println("fast to bottom.");
    }

    public void transform() {
        System.out.println("transform.");
    }
}
