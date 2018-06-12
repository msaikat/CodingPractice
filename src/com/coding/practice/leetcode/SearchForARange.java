package com.coding.practice.leetcode;

import com.coding.practice.mycode.BinarySearch;

public class SearchForARange {
    public int[] searchRange(int[] nums, int target) {
        int index = BinarySearch.binarySearch(nums, target);
        int[] result = new int[]{index, index};

        if (index == -1) {
            return result;
        }

        int i = index;
        while(0 <= --i) {
            if (nums[i] == target) {
                result[0] = i;
            } else {
                break;
            }
        }

        i = index;
        while(++i < nums.length) {
            if (nums[i] == target) {
                result[1] = i;
            } else {
                break;
            }
        }

        return result;
    }
}
