package com.coding.practice.mycode;

public class BinarySearch {
    public static int search(int[] arr, int low, int high, int searchFor) {
        if (low <= high) {
            int median = low + (high - low) / 2;
            if (searchFor < arr[median]) {
                return search(arr, low, median - 1, searchFor);
            } else if (searchFor > arr[median]) {
                return search(arr, median + 1, high, searchFor);
            } else {
                return median;
            }
        } else {
            return -1;
        }
    }

    public static int binarySearch(int[] arr, int searchFor) {
         int low = 0;
         int high = arr.length - 1;

         while(low <= high) {
              int middle = (low + high) / 2;
              if(arr[middle] == searchFor) {
                  return middle;
              }
              if(arr[middle] < searchFor) {
                  low = middle + 1;
              }
              if(arr[middle] > searchFor) {
                  high = middle - 1;
              }
         }
         return -1;
    }
}
