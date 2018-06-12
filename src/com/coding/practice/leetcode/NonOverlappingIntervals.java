package com.coding.practice.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NonOverlappingIntervals {
    public List<Interval> getOverlapIntervals(Interval[] intervals) {
        if (intervals.length == 0) {
            return Collections.emptyList();
        }

        sort(intervals);
        Interval current = intervals[0];
        List<Interval> overlapIntervals = new ArrayList<>();

        for (int i = 1; i < intervals.length; i++) {
            if (current.getEnd() <= intervals[i].getStart()) {
                current = intervals[i];
            } else {
                overlapIntervals.add(intervals[i]);
            }
        }

        return overlapIntervals;
    }

    public List<Interval> getMaxNonOverlapIntervals(Interval[] intervals) {
        if (intervals.length == 0) {
            return Collections.emptyList();
        }

        sort(intervals);
        Interval current = intervals[0];
        List<Interval> maxNonoverlapIntervals = new ArrayList<>();

        for (Interval interval : intervals) {
            if (current.getEnd() <= interval.getStart()) {
                maxNonoverlapIntervals.add(interval);
                current = interval;
            }
        }

        return maxNonoverlapIntervals;
    }

    public int eraseOverlapIntervals(Interval[] intervals) {
        if (intervals.length == 0) {
            return 0;
        }

        sort(intervals);
        Interval current = intervals[0];
        int nonOverlapIntervals = 1;

        for (int i = 1; i < intervals.length; i++) {
            if (current.getEnd() <= intervals[i].getStart()) {
                nonOverlapIntervals++;
                current = intervals[i];
            }
        }

        return intervals.length - nonOverlapIntervals;
    }

    private void sort(Interval[] intervals) {
        Arrays.sort(intervals, (Interval i1, Interval i2) -> {
            if (i1.getEnd() != i2.getEnd()) {
                return i1.getEnd() - i2.getEnd();
            } else {
                return i1.getStart() - i2.getStart();
            }
        });
    }
}
