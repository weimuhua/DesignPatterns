package me.com.patterns.chainofresponsibility;

public abstract class Handler {

    public Handler next;

    public abstract void handle(String condition);
}
