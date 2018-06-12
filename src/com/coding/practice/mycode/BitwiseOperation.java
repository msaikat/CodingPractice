package com.coding.practice.mycode;

public class BitwiseOperation {
    public int addition(int a, int b) {
        if (b == 0) {
            return a;
        }
        int sum = a ^ b;
        int carry = (a & b) << 1;
        return addition(sum, carry);
    }

    public int subtraction(int a, int b) {
        if (b == 0) {
            return a;
        }
        int sum = a ^ b;
        int carry = ((~a) & b) << 1;
        return subtraction(sum, carry);
    }
}
