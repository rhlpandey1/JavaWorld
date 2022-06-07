package org.commoncodes;

import java.util.Scanner;

public class PalindromeNumbers {
    public static void main(String[] args) {
        //code for palindrome Number
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number :");
        int num=sc.nextInt();
        int temp=num;
        int rem,sum=0;
        while(num!=0){
            rem=num%10;
            sum=rem+sum*10;
            num/=10;
        }
        if(temp==sum)
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    }
}
