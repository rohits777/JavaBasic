package com.bridgelabz.day2;

import java.util.Scanner;

public class ArithmaticOperatorProgram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a :: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b :: ");
        int b = sc.nextInt();
        System.out.print("Enter the value of c :: ");
        int c = sc.nextInt();

        //Arithmetic Operations

        System.out.println( a+ " + " + b + " * " + c + " = " + (a+b*c));
        System.out.println( c+ " + " + a + " / " + b + " = " + (c+a/b));
        System.out.println( a+ " % " + b + " + " + c + " = " + (a%b+c));
        System.out.println( a+ " * " + b + " + " + c + " = " + (a*b+c));

        //Checking Max

        if ( a > b && a > c){
            System.out.println("Maximum value is :: " + a);
        } else if (b > a && b > c) {
            System.out.println("Maximum value is :: " + b);
        } else {
            System.out.println("Maximum value is :: " + c);
        }

        //Checking Min

        if ( a < b && a < c){
            System.out.println("Maximum value is :: " + a);
        } else if (b < a && b < c) {
            System.out.println("Maximum value is :: " + b);
        } else {
            System.out.println("Maximum value is :: " + c);
        }
    }
}
