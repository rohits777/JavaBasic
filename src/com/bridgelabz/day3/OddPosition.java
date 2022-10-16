package com.bridgelabz.day3;

public class OddPosition{
    public static void main(String[] args) {
        //initialize array
    int []array = new int[] {12,13,14,15,16,17,18,19};
            System.out.println("Odd position array values are:");

    for( int i=0; i< array.length; i= i+2){
        System.out.println(array [i]);
    }
    }
}