package com.bridgelabz.day2;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Month in number :: ");
        int month = sc.nextInt();
        System.out.print("Enter the Date :: ");
        int day = sc.nextInt();

        if((month == 3 && day >= 16 && day <= 31) || (month == 4 && day >=1 && day <= 30) || (month == 5 && day >= 1 && day <= 31) || (month == 6 && day >=1 && day <=15))
        {
            System.out.println("This is an Spring Season");
        } else {
            System.out.println("This is not an Spring Season");
        }
    }
}