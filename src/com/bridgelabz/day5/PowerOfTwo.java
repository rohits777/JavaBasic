
package com.bridgelabz.day5;
import java.util.*;

public class PowerOfTwo{
    static int totalvalue;

    public static void main(String[] args) {

            System.out.println("Enter the Power of 2:");

            Scanner sc = new Scanner(System.in);

            int Power = sc.nextInt();

            for (int i = 0; i <= Power; i++) {

                totalvalue = (int) Math.pow(2, i);

                System.out.print(" " + totalvalue);

            }

        }


}