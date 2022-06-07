package org.gfk.strings;

import java.util.Scanner;

public class IterateString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.next();
        for (int i=0;i<str.length();i++)
        {
            System.out.println(str.charAt(i));
        }
    }
}
