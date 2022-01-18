package com.pepcoding.level1.Ch1_GettingStarted;

import java.util.Scanner;

public class DigitofNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nod = 0;  // nod = number of digits
        int temp = n;

        // while loop for calculating the digits
        while (temp != 0) {
            temp = temp / 10;
            nod++;
        }

        int div = (int) Math.pow(10, nod - 1);
        while (div != 0) {
            int q = n / div;
            System.out.println(q);

            n = n % div;
            div = div / 10;
        }
    }
}