package com.pepcoding.level1.Ch2_Patterns;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sp = 0;  //sp = space
        int st = n;  //st = start

        //loop for row
        for (int i = 1; i <= n; i++) {

            //loop for spaces
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }

            //loop for star
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            sp++;
            st--;
            System.out.println();
        }
    }
}
