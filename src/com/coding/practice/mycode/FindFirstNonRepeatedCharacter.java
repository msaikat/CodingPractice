package com.coding.practice.mycode;

import java.util.HashMap;

public class FindFirstNonRepeatedCharacter {
    public static char findCharacter(String input) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char c : input.toCharArray()) {
            int count = 1;
            if (charCount.containsKey(c)) {
                count = charCount.get(c) + 1;
            }
            charCount.put(c, count);
        }

        for (char c : input.toCharArray()) {
            if (charCount.get(c) == 1) {
                return c;
            }
        }

        return '\0';

    }
}
