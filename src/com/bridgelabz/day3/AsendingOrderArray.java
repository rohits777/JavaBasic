package com.bridgelabz.day3;

public class AsendingOrderArray {
    public static void main(String[] args) {

        //Initialization of array
        int [] arr = new int [] {55, 22, 88, 77, 11,18,45};
        int temp = 0;

        //Display original arr
        System.out.println("Elements of original array are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //Sorting array in ascending order
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println();

        //Display array after sorting
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}