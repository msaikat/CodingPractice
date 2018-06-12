package com.coding.practice.mycode;

public class SwapArrayElement {

    String[] strArray = {"A", "B"};
    int[] intArray = {1, 2};

    public void testSwap() {
        printIntArray();
        printStrArray();
        swap();
        swapWithString();
        printIntArray();
        printStrArray();
    }

    private void swap() {
        intArray[0] = intArray[0] ^ intArray[1];
        intArray[1] = intArray[0] ^ intArray[1];
        intArray[0] = intArray[0] ^ intArray[1];
    }

    private void swapWithString() {
        strArray[0] = strArray[0] + strArray[1];
        strArray[1] = strArray[0].replace(strArray[1], "");
        strArray[0] = strArray[0].replace(strArray[1], "");
    }


    private void printStrArray() {
        for (String s : strArray) {
            System.out.println(s);
        }
    }

    private void printIntArray() {
        for (int i : intArray) {
            System.out.println(i);
        }
    }
}
