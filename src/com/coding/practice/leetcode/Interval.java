package com.coding.practice.leetcode;

public class Interval {
    private int start;
    private int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return this.start;
    }

    public int getEnd() {
        return this.end;
    }

    public void print() {
        System.out.print("[" + start + ", " + end + "] ");
    }
}
