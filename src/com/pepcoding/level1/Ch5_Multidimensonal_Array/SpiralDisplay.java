package com.pepcoding.level1.Ch5_Multidimensonal_Array;

import java.util.Scanner;

public class SpiralDisplay {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int minrow = 0;
        int mincol = 0;
        int maxrow = arr.length - 1;
        int maxcol = arr[0].length - 1;

        int tne = n * m;      // total number of elements
        int count = 0;         // for keeping count of elements

        while (count<tne) {

            //left wall
            for (int i = minrow, j = mincol; i <= maxrow && count < tne; i++) {
                System.out.println(arr[i][j]);
                count++;
            }
            mincol++;

            //bottom wall
            for (int i = maxrow, j = mincol; j <= maxcol && count < tne; j++) {
                System.out.println(arr[i][j]);
                count++;
            }
            maxrow--;

            // right wall
            for (int i = maxrow, j = maxcol; i >= minrow && count < tne; i--) {
                System.out.println(arr[i][j]);
                count++;
            }
            maxcol--;

            // top wall
            for (int i = minrow, j = maxcol; j >= mincol && count < tne; j--) {
                System.out.println(arr[i][j]);
                count++;
            }
            minrow++;
        }
    }
}
