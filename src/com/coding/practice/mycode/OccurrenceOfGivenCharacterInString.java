package com.coding.practice.mycode;

public class OccurrenceOfGivenCharacterInString {
    public static int findOccurrence(String input, char c) {
        int occurrence = 0;
        if (!input.isEmpty()) {
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == c) {
                    occurrence++;
                }
            }
        }
        return occurrence;
    }
}
