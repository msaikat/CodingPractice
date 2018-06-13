package com.coding.practice.designpattern.command;

import java.util.ArrayList;
import java.util.List;

public class MacroSet {
    private List<Macro> macros = new ArrayList<>();

    public void addMacro(Macro macro) {
        macros.add(macro);
    }
    
    public List<Macro> getMacros() {
        return new ArrayList<>(macros);
    }
}
