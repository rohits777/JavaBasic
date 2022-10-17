package com.bridgelabz.day5;

public class LargeNumber {

    public static void main(String[] args) {

        double n1 = 23, n2 = 21.99, n3 = 57;

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
    }
}