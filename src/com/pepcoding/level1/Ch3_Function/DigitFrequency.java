package com.pepcoding.level1.Ch3_Function;
import java.util.Scanner;

public class DigitFrequency {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
        // write code here

        int num = n;
        int count = 0;

        while (num != 0) {
            int rem = num % 10;
            num = num / 10;
            if (rem == d) {
                count++;
            }
        }
        return count;
    }
}
