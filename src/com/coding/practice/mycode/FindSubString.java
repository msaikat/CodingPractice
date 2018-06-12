package com.coding.practice.mycode;

public class FindSubString {
    public static int FindSubStringStartIndex(String sentence, String word) {
        for (int i = 0; i < sentence.length() - word.length(); ++i) {
            int j = 0;
            while (j < word.length()) {
                if (sentence.charAt(i + j) != word.charAt(j)) {
                    break;
                }
                ++j;
            }
            if (j == word.length()) {
                return i;
            }
        }
        return -1;
    }
}
