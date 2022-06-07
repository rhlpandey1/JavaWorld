package org.gfk.strings;

import java.util.Scanner;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i)))
                count++;
        }
        System.out.println("count of digit :->"+count);
    }
}
