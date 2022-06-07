package org.gfk.strings;

import java.util.Scanner;

public class RemoveWordFromAString {
    static String removeWord(String input,String word){
        if(input.contains(word))
        {
            String str1=input.replaceAll(word,"").trim();
            return str1;
        }
        else
            return input;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your String:");
        String input= scanner.nextLine();
        System.out.println("Enter the word to be removed:");
        String word=scanner.next();
        System.out.println("The output is "+removeWord(input,word));
    }
}
