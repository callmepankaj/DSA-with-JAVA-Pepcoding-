package com.pepcoding.level1.Ch1_GettingStarted;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;

        while (n != 0) {
            int rem = (n % 10);
            n = n / 10;
            System.out.println(rem);
        }

    }
}