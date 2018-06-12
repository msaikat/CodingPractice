package com.coding.practice.mycode;

public class StringPermutation {
    public static void permutation(String input) {
        permutation("", input);
    }

    private static void permutation(String perm, String word) {
        if (word.length() > 1) {
            for (int i = 0; i < word.length(); i++) {
                permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
            }
        } else {
            System.out.println(perm + word);
        }
    }
}
