package com.coding.practice.mycode;

public class Palindrome {

    public static boolean isPalindromeString(String input) {
        int i = 0;
        int j = input.length() - 1;
        while(i < j) {
            if (input.toCharArray()[i] != input.toCharArray()[j]) {
                return false;
            }
            ++i;
            --j;
        }
        return true;
    }

}
