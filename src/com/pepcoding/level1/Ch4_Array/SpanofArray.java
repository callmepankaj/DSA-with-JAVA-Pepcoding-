package com.pepcoding.level1.Ch4_Array;

import java.util.Arrays;
import java.util.Scanner;

public class SpanofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            // taking input in array
            nums[i] = sc.nextInt();
        }

        int max = nums[0], min = nums[0];

        for (int i = 1; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
            } else if (nums[i] < min) {
                min = nums[i];
            }
        }
        int span = max - min;
        System.out.println(span);

//         or
//        Arrays.sort(nums);
//        int diff = nums[n - 1] - nums[0];
//        System.out.println(diff);
    }
}
