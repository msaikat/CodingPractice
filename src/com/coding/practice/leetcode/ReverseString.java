package com.coding.practice.leetcode;

public class ReverseString {
    public static String reverseString(String s) {
        char[] charArray = s.toCharArray();
        reverseCharArray(0, s.length() - 1, charArray);
        return String.valueOf(charArray);
    }

    private static void reverseCharArray(int start, int end, char[] array) {
        while(start < end) {
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            ++start;
            --end;
        }
    }

    public static String doStringReverse(String input) {
        if(input == null || input.isEmpty()) {
            return input;
        }
        return input.charAt(input.length()- 1) + doStringReverse(input.substring(0, input.length() - 1));
    }
}
