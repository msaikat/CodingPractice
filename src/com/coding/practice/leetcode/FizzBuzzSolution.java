package com.coding.practice.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzSolution {

    public static List<String> fizzBuzz(int n) {
        List<String> output = new ArrayList<>();
        for (int i = 1; i <= n ; ++i) {
            output.add(getOutputString(i));
        }
        return output;
    }
    
    private static String getOutputString(int i) {
        if (i % (3*5) == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(i);
        }
    }
}
