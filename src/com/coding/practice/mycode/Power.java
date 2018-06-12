package com.coding.practice.mycode;

public class Power {
    public static int calculatePower(int x, int y)
    {
        int temp;
        if(y == 0)
            return 1;
        temp = calculatePower(x, y/2);
        if (y%2 == 0)
            return temp * temp;
        else
            return x * temp * temp;
    }
}
