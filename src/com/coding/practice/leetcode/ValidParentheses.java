package com.coding.practice.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    Map<Character, Character> parenthesesMap;
    Stack<Character> stack;

    public ValidParentheses() {
        parenthesesMap = new HashMap<Character, Character>();
        parenthesesMap.put('(', ')');
        parenthesesMap.put('{', '}');
        parenthesesMap.put('[', ']');

        stack = new Stack<Character>();
    }

    public boolean isValid(String s) {
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && parenthesesMap.containsValue(c)) {
                if (parenthesesMap.get(stack.peek()).equals(c)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (parenthesesMap.containsKey(c)) {
                stack.push(c);
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
