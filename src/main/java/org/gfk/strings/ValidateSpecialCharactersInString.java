package org.gfk.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSpecialCharactersInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String str=sc.next();
        boolean flag=true;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='~'|c=='!'|c=='@'|c=='#'|c=='$'|c=='%'|c=='^'|c=='&'|c=='*'){
                flag=false;
                break;
            }
        }
        if(flag==false)
            System.out.println("The String contains special characters");
        else
            System.out.println("No SPl");
        int count=0;
        for(int i=0;i<str.length();i++){
            if(!Character.isDigit(str.charAt(i))&&!Character.isWhitespace(str.charAt(i))
                    &&!Character.isLetter(str.charAt(i)))
                count++;
        }
        if(count>0)
            System.out.println("The String contains special characters");
        else
            System.out.println("No SPl");

        //using regex
        Pattern p= Pattern.compile("[^a-z0-9 ]",Pattern.CASE_INSENSITIVE);
        Matcher m=p.matcher(str);
        if(m.find())
            System.out.println("The String contains special characters");

    }
}
