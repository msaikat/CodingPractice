package com.coding.practice.leetcode;

import java.util.HashMap;
import java.util.Stack;

public class LongestValidParentheses {

    public static int getValidParenthesesLength(String string) {
        int length = 0;

        if (string.isEmpty()) {
            return length;
        }

        HashMap<Character, Character> parenthesesMap = new HashMap<Character, Character>();
        parenthesesMap.put('(', ')');

        Stack<Character> stack = new Stack<Character>();

        int count = 0;
        for (char c : string.toCharArray()) {
            if (!stack.isEmpty() && (c == parenthesesMap.get(stack.peek()))) {
                stack.pop();
                count += 2;
            } else if (parenthesesMap.keySet().contains(c)) {
                stack.push(c);
            } else {
                if (count > length) {
                    length = count;
                }
                count = 0;
            }
        }

        return count > length ? count : length;
    }

}
