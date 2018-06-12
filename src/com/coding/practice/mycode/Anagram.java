package com.coding.practice.mycode;

public class Anagram {

    public static boolean isAnagram(String word, String anagram){
        if (word.length() != anagram.length()) {
            return false;
        }

        StringBuilder sb = new StringBuilder(anagram.toLowerCase());
        for (char c : word.toLowerCase().toCharArray()) {
            int i = sb.indexOf("" + c);

            if (i > -1) {
                sb.deleteCharAt(i);
            }
        }

        return sb.toString().isEmpty();
    }
}
