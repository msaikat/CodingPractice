package com.coding.practice.mycode;

public class RemoveDuplicateCharacters {
    public static String removeDuplicateCharacters(String input) {
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (sb.indexOf("" + c) == -1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
