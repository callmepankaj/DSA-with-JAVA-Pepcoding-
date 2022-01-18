package com.pepcoding.level1.Ch3_Function;

import java.util.Scanner;

public class DecimalToBase {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n, int b) {
        // write code here
        int ans_num = 0, multiplier = 1;
        while (n > 0)
        {
            int remainder = n % b;
            n = n / b;
            ans_num = ans_num + remainder * multiplier;
            multiplier *= 10;
        }
        return ans_num;
    }
}
