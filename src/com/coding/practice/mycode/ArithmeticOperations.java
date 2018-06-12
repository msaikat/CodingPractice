package com.coding.practice.mycode;

public class ArithmeticOperations {
    public void test() {
        System.out.println("SUM : " + getSum(2, 3));
        System.out.println("SUB : " + getSub(50, 47));
        System.out.println("MULT : " + multiply(5, 6));
        System.out.println("DIV : " + divide(5, 2));

        bitShiftTest();
    }

    public static int getSum(int a, int b) {
        while(b!=0){
            int c = a&b;
            a=a^b;
            b=c<<1;
        }
      
        return a;
     }

    public static int getSub(int a, int b) {
        while(b!=0){
            int c = (~a)&b;
            a=a^b;
            b=c<<1;
        }
      
        return a;
     }

    public static int multiply(int a, int b) {
        int result = 0;
        while (b != 0) {              // Iterate the loop till b == 0
            if ((b & 1) != 0) {       // Bitwise & of the value of b with 01
                result = result + a;  // Add a to result if b is odd .
            }
            a<<=1;                    // Left shifting the value contained in 'a' by 1
                                      // Multiplies a by 2 for each loop
            b>>=1;                    // Right shifting the value contained in 'b' by 1.
        }
        return result;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException(
                    "Division by 0 is undefined: " + a + "/" + b);
        }
        int sign = 1;
        if (a < 0) {
            a = -a;
            sign = -sign;
        }
        if (b < 0) {
            b = -b;
            sign = -sign;
        }
        double result = 0;
        while (a >= 0) {
            a -= b;
            result++;
        }
        return (result - 1) * sign;
    }

    public static void bitShiftTest() {
         int number = 8; //0000 1000
         System.out.println("Original number : " + number);

         //left shifting bytes with 1 position
         number = number<<1; //should be 16 i.e. 0001 0000

         //equivalent of multiplication of 2
         System.out.println("value of number after left shift (multiplication by 2): " + number);

         number = 100;

         //right shifting bytes with sign 1 position
         number = number>>1; //should be 16 i.e. 0001 0000

         //equivalent of division of 2
         System.out.println("value of number after right shift with sign (division by 2): " + number);
    }

    public static int add(int a, int b){
        if(b == 0) return a;
        int sum = a ^ b; //SUM of two integer is A XOR B
        int carry = (a & b) << 1;  //CARRY of two integer is A AND B
        return add(sum, carry);
    }
}
