package com.coding.practice.mycode;

public class QuickSort {
    
    public static void doQuickSort(int[] a, int start, int end) {
        if (start < end) {
            int p = partition(a, start, end);
            doQuickSort(a, start, p - 1);
            doQuickSort(a, p + 1, end);
        }
    }

    private static int partition(int[] a, int start, int end) {
        int pivot = a[end];
        int temp = 0;
        int i = start - 1;
        for (int j = start; j < end; ++j) {
            if (a[j] <= pivot) {
                ++i;
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        ++i;
        temp = a[i];
        a[i] = pivot;
        a[end] = temp;

        return i;
    }
}
