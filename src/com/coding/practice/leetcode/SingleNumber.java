package com.coding.practice.leetcode;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;

public class SingleNumber {
    public int getSingleNumber(int[] numbers) {
        Set<Integer> tracker = new HashSet<Integer>();
        for (int i : numbers) {
            if (!tracker.add(i)) {
                tracker.remove(i);
            }
        }

        if (tracker.isEmpty()) {
            throw new NoSuchElementException("No Element Found");
        } else {
            return tracker.iterator().next();
        }
    }
}
