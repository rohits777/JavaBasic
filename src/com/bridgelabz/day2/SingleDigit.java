package com.bridgelabz.day2;

import java.util.*;
public class SingleDigit {
    static void printWord(String N)
    {
        int length = N.length();

        for (int i = 0; i < length; i++)
        {
            char j = (N.charAt(i));

            if(j=='1')
                System.out.print("One");
            else if(j=='2')
                System.out.print("Two");
            else if(j=='3')
                System.out.print("Three");
            else if(j=='4')
                System.out.print("Four");
            else if(j=='5')
                System.out.print("Five");
            else if(j=='6')
                System.out.print("Six");
            else if(j=='7')
                System.out.print("Seven");
            else if(j=='8')
                System.out.print("Eight");
            else if(j=='9')
                System.out.print("Nine");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number to print in words ::");
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        printWord(N);
    }
}