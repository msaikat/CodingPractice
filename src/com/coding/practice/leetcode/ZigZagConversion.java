package com.coding.practice.leetcode;

public class ZigZagConversion {

    public static String convert(String string, int numRows) {
        if (numRows == 1)
            return string;
     
        StringBuilder sb = new StringBuilder();
        // step
        int step = 2 * numRows - 2;
     
        for (int i = 0; i < numRows; i++) {
            //first & last rows
            if (i == 0 || i == numRows - 1) {
                for (int j = i; j < string.length(); j = j + step) {
                    sb.append(string.charAt(j));
                }
            //middle rows   
            } else {
                int j = i;
                boolean flag = true;
                int step1 = 2 * (numRows - 1 - i);
                int step2 = step - step1;
     
                while (j < string.length()) {
                    sb.append(string.charAt(j));
                    if (flag)
                        j = j + step1;
                    else
                        j = j + step2;
                    flag = !flag;
                }
            }
        }
     
        return sb.toString();
    }

}
