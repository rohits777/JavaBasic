package com.bridgelabz.day3;

public class ReverseArray {
    public static void main(String[] args) {
        //Initialize array
        int [] arr = new int [] {11, 12, 13, 14, 15,16};
        System.out.println("Original array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Array in reverse order is: ");
        //Loop through the array in reverse order
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
