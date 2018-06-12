package com.coding.practice.mycode;

public class QuickSortStringArrayBasedOnSize {

    public static void doQuickSort(String[] array, int start, int end) {
        if (start < end) {
            int p = partition(array, start, end);
            doQuickSort(array, start, p - 1);
            doQuickSort(array, p + 1, end);
        }
    }

    private static int partition(String[] array, int start, int end) {
        int pivot = array[end].length();
        int i = start - 1;
        String temp;

        for (int j = start; j < end; j++) {
            if (array[j].length() <= pivot) {
                i++;
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        i++;
        temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }
}
