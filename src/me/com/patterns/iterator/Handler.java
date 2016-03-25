package me.com.patterns.iterator;

public abstract class Handler {

    public Handler next;

    public abstract void handle(String condition);
}
