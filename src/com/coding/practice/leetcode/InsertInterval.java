package com.coding.practice.leetcode;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> result = new ArrayList<>();

        for (Interval interval : intervals) {
            if (interval.getEnd() < newInterval.getStart()) {
                result.add(interval);
            } else if (newInterval.getEnd() < interval.getStart()) {
                result.add(newInterval);
                newInterval = interval;
            } else if ((interval.getStart() <= newInterval.getStart()) || (newInterval.getStart() <= interval.getStart())) {
                newInterval = new Interval(Math.min(interval.getStart(), newInterval.getStart()), Math.max(interval.getEnd(), newInterval.getEnd()));
            }
        }

        result.add(newInterval);
        return result;
    }
}
