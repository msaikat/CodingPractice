package com.coding.practice.mycode;

import java.util.Stack;

public class CoinDenominator {

    int[] coins = {3, 4};
    Stack<Integer> stack = new Stack<>();

    private void denominateCoins(int amount) {

        if (amount == 0) {
            printStack();
            return;
        }

        for (int i : coins) {
            if (amount - i < 0) {
                continue;
            }
            stack.push(i);
            denominateCoins(amount - i);
            stack.pop();
        }
    }

    private void printStack() {
        for (int i : stack) {
            System.out.print(i);
        }
        System.out.println();
    }

    public void test() {
        denominateCoins(30);
    }
}
