package com.pepcoding.level1.Ch3_Function;

import java.util.Scanner;

public class Factorial {

    public static int fact(int n) {

        int rv = 1;
        for (int i = 1; i <= n; i++) {
            rv = rv * i;
        }
        return rv;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int num = fact(n);
        int den = fact(n - r);
        int nPr = num / den;

        System.out.println("nPr : " + nPr);
    }
}
