package com.leetcode;

import java.util.Scanner;

public class FindEvenNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i <= arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i <= arr.length; i++) {
            int num = arr[i] % 10;
        }

    }
}
