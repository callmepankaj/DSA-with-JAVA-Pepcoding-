package com.pepcoding.level1.Ch4_Array;

public class CreatingArray {
    public static void main(String[] args) {

        // That's how we declare an array in java
        // datatype arrayName[] = new datatype[size];

        int[] num = new int[5];

        // storing values in array one by one
        num[0] = 12;
        num[1] = 14;
        num[2] = 16;
        num[3] = 18;

        System.out.println("The length of the array is " + num.length);
        System.out.println("The value at index 2 is : " + num[2]);
        System.out.println("The value at index 4 is : " + num[4]);

        // or to print all numbers in array
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
