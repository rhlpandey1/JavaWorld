package org.gfk.strings;

import java.util.Scanner;

public class RemoveAWordFromString {
    static String removeWord(String str,String word){
        str=str.replaceAll(word,"");
        return str;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your input");
        String input=sc.nextLine();
        System.out.println("Enter the word to be removed:->");
        String word=sc.next();
        System.out.println(removeWord(input,word));
    }
}
