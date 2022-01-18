package com.pepcoding.level1.Ch4_Array;

import java.util.Scanner;

public class TakingInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            // taking input in array
            nums[i] = sc.nextInt();
        }

        // printing array elements
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}
