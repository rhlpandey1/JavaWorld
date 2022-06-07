package org.gfk.strings;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your String:");
        String input= scanner.next();
        String str1="";
        for(int i=input.length()-1;i>=0;i--){
            str1+=input.charAt(i);
        }
        System.out.println("Reversed string is "+str1);
        if(str1.equalsIgnoreCase(input))
            System.out.println("Palindrome");
        else
            System.out.println("not palindrome");
    }
}
