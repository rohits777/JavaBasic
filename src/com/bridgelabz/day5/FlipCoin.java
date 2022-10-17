package com.bridgelabz.day5;

import java.util.*;
public class FlipCoin {
    public static void main(String[] args) {
        //initialization
        int n, h_count=0, t_count=0;
        double heads,tails;
        Scanner u= new Scanner(System.in);

        //input data
        System.out.println("Enter number of times flip the coin:-");
        n= u.nextInt();

        //Computation
        for(int i=0; i<n; i++){
            double random=Math.random();
            if (random < 0.5)
                 t_count++;
            else
                h_count++;
        }
        heads= h_count / (double) n *100;
        tails =t_count / (double) n *100;

        System.out.println("Percentage of heads is:" +heads + "%");
        System.out.println("Percentage of tails is:" +tails + "%");
    }
}
