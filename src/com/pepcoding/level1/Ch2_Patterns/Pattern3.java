package com.pepcoding.level1.Ch2_Patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nsp = n - 1;
        int nst = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < nsp; j++) {
                System.out.print("\t");
            }

            for (int j = 0; j < nst; j++) {
                System.out.print("*\t");
            }

            nsp--;
            nst++;
            System.out.println();
        }

    }
}

