package org.commoncodes;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        //code for palindrome String
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string :");
        String str=sc.next();
        String str1="";
        for(int i=str.length()-1;i>=0;i--){
            str1=str1+str.charAt(i);
        }
        if(str.equalsIgnoreCase(str1))
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");

        StringBuilder sb=new StringBuilder(str);
        String str2=sb.reverse().toString();
        if(str.equalsIgnoreCase(str2))
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");

    }
}
