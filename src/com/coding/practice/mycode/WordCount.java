package com.coding.practice.mycode;

public class WordCount {
    public static void countWordInSentence(String sentence) {
        int start = 0;
        int end = 0;

        //trim from start
        for (int i = 0; i < sentence.length(); ++i) {
            if (sentence.toCharArray()[i] != ' ') {
                start = i;
                break;
            }
        }

        //trim from end
        for (int i = sentence.length() - 1; i >= 0; --i) {
            if (sentence.toCharArray()[i] != ' ') {
                end = i;
                break;
            }
        }

        int count = 0;
        for (int i = start; i < end; ++i) {
            if ((i == start) || (i > start && sentence.toCharArray()[i] == ' ' && sentence.toCharArray()[i-1] != ' ')) {
                count++;
            }
        }
        System.out.println("Start: " + start + ", End: " + end + ", Count: " + count);
    }
}
