package com.bridgelabz.day2;

import java.util.Scanner;

public class ReverseNumberForLoop {
    public static void main(String[] args) {
        System.out.print("Enter the number :: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;

        for (; num != 0; num /= 10){
            int digit = num % 10;
            rev = rev * 10 + digit;
        }
        System.out.println("Reverse of the number is  :: " + rev);
    }
}