package com.bridgelabz.day3;

public class EvenPosition {
    public static void main(String[] args) {

        //Initialize array
        int [] arr = new int [] {11, 22, 33, 44, 55,23, 45,67};

        System.out.println("Elements of array present on even position are: ");
        //Loop through the array by incrementing value of i by 2
        //Here, i will start from 1 as first even positioned element is present at position 1.
        for (int i = 1; i < arr.length; i = i+2) {
            System.out.println(arr[i]);
        }
    }
}
