package org.gfk.strings;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountNumberOfVowels {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string :");
        String str=scanner.next().toLowerCase(Locale.ROOT);
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'|ch=='e'|ch=='i'|ch=='o'|ch=='u')
                count++;
        }
        System.out.println("No of  Vowels are :->"+count);
        //using regex
        int count1=0;
        Pattern pattern = Pattern.compile("[aeiou]");
        // Search above pattern in "geeksforgeeks.org"
        Matcher m = pattern.matcher(str);
        for(int i=0;i<str.length();i++){
            if(m.find())
                count1++;
        }
        System.out.println("No of  Vowels are :->"+count1);
    }
}
