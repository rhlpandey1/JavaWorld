package org.gfk.strings;

import java.util.Locale;
import java.util.Scanner;

public class OddCharsToUppercase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String str=sc.next();
        String str1="";
        for(int i=0;i<str.length();i++){
            if(i%2!=0)
                str1=str1+(str.charAt(i)+"").toUpperCase(Locale.ROOT);
            else
                str1=str1+str.charAt(i);
        }
        System.out.println("The output is :->"+str1);
    }
}
