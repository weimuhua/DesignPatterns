package me.com.patterns.command;

public class Buttons {

    private LeftCommand leftCommand;
    private RightCommand rightCommand;
    private FallCommand fallCommand;
    private TransformCommand transformCommand;

    public Buttons(LeftCommand leftCommand, RightCommand rightCommand,
                   FallCommand fallCommand, TransformCommand transformCommand) {
        this.leftCommand = leftCommand;
        this.rightCommand = rightCommand;
        this.fallCommand = fallCommand;
        this.transformCommand = transformCommand;
    }

    public void toLeft() {
        leftCommand.execute();
    }

    public void toRight() {
        rightCommand.execute();
    }

    public void fallCommand() {
        fallCommand.execute();
    }

    public void transformCommand() {
        transformCommand.execute();
    }
}
