package com.bridgelabz.day3;

public class ArraySmallestElement {
    public static void main(String[] args) {

        //Initialize array
        int [] arr = new int [] {18, 11, 77, 57, 556};
        //Initialize max with first element of array.
        int min = arr[0];
        //Loop through the array
        for (int i = 0; i < arr.length; i++) {
            //Compare elements of array with max
            if(arr[i] < min)
                min = arr[i];
        }
        System.out.println("Smallest element present in array: " + min);
    }
}