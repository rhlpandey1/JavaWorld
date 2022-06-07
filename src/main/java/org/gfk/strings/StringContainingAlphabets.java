package org.gfk.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Check if a string contains only alphabets in Java
//Input: GeeksforGeeks
//Output: true
public class StringContainingAlphabets {
    static boolean checkAlphabets(String str){
        for(int i=0;i<str.length();i++){
            if(!Character.isLetter(str.charAt(i)))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your String:");
        String input= scanner.next();
        System.out.println(checkAlphabets(input));
    }
}
