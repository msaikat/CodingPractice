package com.coding.practice.designpattern.command;

public class MacroActionFactory {
    public static MacroAction createMacroAction(String type) {
        switch (type.toLowerCase()) {
            case "play":
                return new PlayMacroAction("RECEIVER - Play");
    
            case "pause":
                return new PauseMacroAction("RECEIVER - Pause");
        }
        return null;
    }
}
