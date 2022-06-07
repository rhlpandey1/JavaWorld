package org.gfk.strings;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
         /*regexToRemoveUpperCaseCharacters  = “[A-Z]”
         regexToRemoveLowerCaseCharacters = “[a-z]”
         regexToRemoveSpecialCharacters = “[^A-Za-z0-9]”
         regexToRemoveNumericCharacters = “[0-9]”
         regexToRemoveNon-NumericCharacters = “[^0-9]”*/
public class RemoveCharactersUsingRegEX {
    static String removeCharacters(String str,String regEx){
        Pattern pattern=Pattern.compile(regEx);
        Matcher m=pattern.matcher(str);
        return m.replaceAll("");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input String:");
        String str=sc.next();
        System.out.println("Enter the type:");
        String type=sc.next();
        System.out.println("Enter the regex:");
        String regex=sc.next();
        System.out.println("After removing "+type+" the output is "+removeCharacters(str,regex));
    }
}
