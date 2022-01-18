package com.pepcoding.level1.Ch1_GettingStarted;

import java.util.Scanner;

public class CountDigitNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        int count = 0;

        while (n != 0) {
            long rem = (n % 10);
            count++;
            n = n / 10;
        }
        System.out.println(count);
    }
}
