package com.coding.practice.mycode;

public class CountVowelConsonent {
    public static void countVowelConsonent(String input) {
        int vCount = 0;
        int cCount = 0;
        for (char c : input.toLowerCase().toCharArray()) {
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vCount++;
                    continue;
                default:
                    if (97 <= (int)c && (int)c <= 122) {
                        cCount++;
                    }
            }
        }

        System.out.println(input + " has " + vCount + " vowel(s) and " + cCount + " consonant(s)");
    }
}
