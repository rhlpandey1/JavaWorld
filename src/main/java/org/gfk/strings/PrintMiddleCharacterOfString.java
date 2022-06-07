package org.gfk.strings;

import java.util.Scanner;

public class PrintMiddleCharacterOfString {
    static void printMiddle(String input){
        int middle= input.length()/2;
        System.out.println(input.charAt(middle));
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your String:");
        String input= scanner.next();
        printMiddle(input);
    }
}
