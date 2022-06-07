package org.gfk.strings;

import java.util.Scanner;

public class RemoveFirstAndLastCharacters {
    static String removeFirstLast(String input){
        String last=input.substring(input.length()-1);
        String first=input.substring(0,1);
        String output=input.replace(first,"").replace(last,"");
        System.out.println(input.substring(1,input.length()-1));
       return  output;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your String:");
        String input= scanner.next();
        System.out.println(removeFirstLast(input));
    }
}
