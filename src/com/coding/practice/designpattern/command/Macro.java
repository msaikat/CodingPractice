package com.coding.practice.designpattern.command;

import java.util.ArrayList;
import java.util.List;

public class Macro {

    private String key;

    private List<MacroAction> macroActions = new ArrayList<>();

    public Macro(String key) {
        this.key = key;
    }

    public void execute() {
        for (MacroAction macroAction : macroActions) {
            macroAction.execute();
        }
    }

    public void addMacroAction(MacroAction macroAction) {
        this.macroActions.add(macroAction);
    }

    public String getKey() {
        return key;
    }
}
