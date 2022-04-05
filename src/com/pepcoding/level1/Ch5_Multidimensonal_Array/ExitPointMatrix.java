package com.pepcoding.level1.Ch5_Multidimensonal_Array;

import java.util.Scanner;

public class ExitPointMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int dir = 0;  // East->0 South->1 West->2 North->3
        int i = 0;
        int j = 0;

        while (true) {
            dir = (dir + arr[i][j]) % 4;
            if (dir == 0) {
                j++;       //Move in the same row (east direction)
            } else if (dir == 1) {
                i++;      //Move down the column (south direction)
            } else if (dir == 2) {
                j--;      //Move backwards in the row (west direction)
            } else if (dir == 3) {
                i--;     //Move up the column (north direction)
            }

            if (i < 0) {
                i++; // exit point is one row ahead ( means 0th row)
                break;
            } else if (j < 0) {
                j++;  // exit point is one col ahead (in 0th col)
                break;
            } else if (i == arr.length) {
                i--;  //  exit point is one row back (in last row)
                break;
            } else if (j == arr[0].length) {
                j--;  // exit point is one col back (in last col)
                break;
            }
        }

        System.out.println(i);
        System.out.println(j);
    }
}
