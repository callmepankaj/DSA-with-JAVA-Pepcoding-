package com.pepcoding.level1.Ch1_GettingStarted;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println((a * a) == (b * b) + (c * c));
        } else if (b >= a && b >= c) {
            System.out.println((b * b) == (a * a) + (c * c));
        } else
            System.out.println((c * c) == (a * a) + (b * b));
    }
}
