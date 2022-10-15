package com.bridgelabz.day2;

import java.util.Scanner;

public class MonthNameSwitch {
    public static void main(String[] args) {
        System.out.print("Enter the Month Number :: ");
        Scanner sc = new Scanner(System.in);
        int mon = sc.nextInt();
        switch (mon) {
            case 1 -> System.out.println("The name of month number 1 is January");
            case 2 -> System.out.println("The name of month number 2 is February");
            case 3 -> System.out.println("The name of month number 3 is March");
            case 4 -> System.out.println("The name of month number 4 is April");
            case 5 -> System.out.println("The name of month number 5 is May");
            case 6 -> System.out.println("The name of month number 6 is June");
            case 7 -> System.out.println("The name of month number 7 is July");
            case 8 -> System.out.println("The name of month number 8 is August");
            case 9 -> System.out.println("The name of month number 9 is September");
            case 10 -> System.out.println("The name of month number 10 is October");
            case 11 -> System.out.println("The name of month number 11 is November");
            case 12 -> System.out.println("The name of month number 12 is December");
            default -> System.out.println("You have entered an invalid number");
        }
    }
}