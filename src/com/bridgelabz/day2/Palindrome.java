package com.bridgelabz.day2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.print("Enter the number :: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;

        for (; num != 0; num /= 10){
            int digit = num % 10;
            rev = rev * 10 + digit;
        }

        if (rev == temp) {
            System.out.println("Given number is a Palindrome  :: " + temp);
        } else {
            System.out.println("Given number is not a Palindrome  :: " + temp);
        }
    }
}
