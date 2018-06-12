package com.coding.practice.mycode;

public class InsertionSort {

    public void testInsertionSort() {
        doInsertionSort(new int[]{9, 6, 5, 0, 8, 2, 7, 1, 3});
    }

    private void doInsertionSort(int[] testArray) {
        for (int i = 1; i < testArray.length; i++) {

            int key = testArray[i];
            int j = i - 1;
            while (j >= 0 && testArray[j] > key) {
                testArray[j + 1] = testArray[j];
                j--;
            }

            testArray[++j] = key;
        }
    }
}
