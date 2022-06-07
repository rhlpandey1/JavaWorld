package org.gfk.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckIfStringContainsOnlyAlphabets {
    static boolean checkAlpha(String str){
      return str.matches("^[a-zA-Z]*$");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input");
        String input=sc.next();
        System.out.println(checkAlpha(input));
    }
}
