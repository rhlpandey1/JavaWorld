package org.gfk.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Special char regEx=“[^A-Za-z0-9]”
public class CheckIfStringContainsOnlySpecialCharacters {
    static boolean checkSpecial(String input,String regEx){
        Pattern pattern=Pattern.compile(regEx);
        Matcher m=pattern.matcher(input);
        String op=m.replaceAll("");
        if(op.length()==0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input String:");
        String str=sc.next();
        System.out.println("Enter the regex:");
        String regex=sc.next();
        System.out.println("Input String contains only special char? :->"+checkSpecial(str,regex));
    }
}
