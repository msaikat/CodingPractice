package com.coding.practice.designpattern.command;

public class CommandTester {
    public static void main(String[] args) {
        //Environment preparation
        Macro macro1 = new Macro("1");
        macro1.addMacroAction(MacroActionFactory.createMacroAction("play"));

        Macro macro2 = new Macro("2");
        macro2.addMacroAction(MacroActionFactory.createMacroAction("pause"));

        MacroSet macroset = new MacroSet();
        macroset.addMacro(macro1);
        macroset.addMacro(macro2);
        
        //Testing
        MacroUtil.executeMacroCommand("2", macroset);
    }
}
