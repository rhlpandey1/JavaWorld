package org.commoncodes;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your year :");
        int num=sc.nextInt();
        if((num%4)==0)
        {
            if(num%100==0) {
                if (num % 400 == 0)
                    System.out.println("leap year");
                else
                    System.out.println("not leap year");
            }
            else
                System.out.println("Leap year");
        }
        else
            System.out.println("Not a leap year");

    }
}
