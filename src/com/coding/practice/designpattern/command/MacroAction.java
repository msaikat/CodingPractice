package com.coding.practice.designpattern.command;

//This is basically the command interface of command pattern
public interface MacroAction {
    void execute();
}

class PlayMacroAction implements MacroAction {
    private String receiver;

    public PlayMacroAction(String receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println(receiver + " executed");
    }

}

class PauseMacroAction implements MacroAction {
    private String receiver;

    public PauseMacroAction(String receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println(receiver + " executed");
    }

}
