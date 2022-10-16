package com.bridgelabz.day3;

public class DuplicateArray {
    public static void main(String[] args) {

        //Initialize array
        int [] arr = {21,22,25,24,25,26,22,77,23,77};

        System.out.println("Duplicate elements in given array are: ");
        //Searches for duplicate element
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}
