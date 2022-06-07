package org.gfk.strings;

import java.util.Scanner;

public class RemoveNonAlphaNumericCharacters {
    static String removeNonAlphaNum(String str){
        String regex="[^a-z A-Z]";
        return  str.replaceAll(regex,"");
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your String:");
        String input= scanner.next();
        System.out.println(removeNonAlphaNum(input));
    }
}
