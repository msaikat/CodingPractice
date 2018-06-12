package com.coding.practice.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeIntervals {

    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> result = new ArrayList<>();
        sortList(intervals);

        if (!intervals.isEmpty()) {
            Interval current = intervals.get(0);
            for (int i = 1; i < intervals.size(); i++) {
                if (current.getEnd() < intervals.get(i).getStart()) {
                    result.add(current);
                    current = intervals.get(i);
                } else {
                    current = new Interval(current.getStart(), Math.max(current.getEnd(), intervals.get(i).getEnd()));
                }
            }
            result.add(current);
        }

        return result;
    }

    private void sortList(List<Interval> intervals) {
        Collections.sort(intervals, (Interval interval1, Interval interval2) -> {   //Lambda for comparator
            if (interval1.getStart() != interval2.getStart() ) {
                return interval1.getStart() - interval2.getStart();
            } else {
                return interval1.getEnd() - interval2.getEnd();
            }
        });
    }
}
