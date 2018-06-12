package com.coding.practice.mycode;

public class FibonacciSeriesGenerator {

    public void generateSeriesUsingSpaceOptimizedMethod(int numberOfTerms) {
        
        int term1 = 0;
        int term2 = 1;
        int sum;
        System.out.print(term1 + ", " + term2);

        for (int i = 2; i < numberOfTerms; i++) {
            sum = term1 + term2;
            System.out.print(", " + sum);
            term1 = term2;
            term2 = sum;
        }

    }

    public void generateSeriesUsingFunctionalProgramming(int numberOfTerms) {
        int[] series = new int[numberOfTerms];

        series[0] = 0;
        series[1] = 1;

        for (int i = 2; i < numberOfTerms; i++) {
            series[i] = series[i - 1] + series[i - 2];
        }

        for (int i : series) {
            System.out.print(" " + i);
        }
    }
}
