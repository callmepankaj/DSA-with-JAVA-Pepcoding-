package com.pepcoding.level1.Ch4_Array;

import java.util.Scanner;

public class FindElementinArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];


        for (int i = 0; i < nums.length; i++) {
            // taking input in array
            nums[i] = sc.nextInt();
        }

        int check = sc.nextInt();
        int idx = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == check) {
                idx = i;
                break;
            }
        }
        System.out.println(idx);

    }
}
