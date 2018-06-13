package com.coding.practice.designpattern.command;

public class MacroUtil {
    public static void executeMacroCommand(String key, MacroSet macroset) {
        macroset.getMacros().forEach(macro -> {
            if (macro.getKey().equals(key)) {
                macro.execute();
            }
        });
    }
}
