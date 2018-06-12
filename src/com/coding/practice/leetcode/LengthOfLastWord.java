package com.coding.practice.leetcode;

public class LengthOfLastWord {

    public static int getLengthOfLastWord(String sentence) {
        int length = 0, tail = sentence.length() - 1;

        while (tail >= 0 && sentence.charAt(tail) == ' ')
            tail--;

        while (tail >= 0 && sentence.charAt(tail) != ' ') {
            length++;
            tail--;
        }

        return length;
    }
}
