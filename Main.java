package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double totalcost, amt;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount :");
        amt = sc.nextDouble();

        if(amt<2000)
        {
            totalcost = amt - amt * 0.05;
        }
        else if(amt>=2001 && amt<=5000)
        {
            totalcost = amt - amt * 0.25;
        }
        else if(amt>=5001 && amt<=10000)
        {
            totalcost = amt - amt * 0.35;
        }
        else
        {
            totalcost = amt - amt *  0.50;
        }

        System.out.println("The Final Amount after Discount :" +totalcost);

    }
}
