package org.gfk.strings;

import java.util.Scanner;

public class SwapFirstAndLastCharacters {
    static String swapFirstLast(String input){
        String last=input.substring(input.length()-1);
        String middle=input.substring(1,input.length()-1);
        String first=input.substring(0,1);
        String output=last+middle+first;
       return  output;
    }
    static String swapFirstLastUsingSwap(String input){
        if(input.length()<0)
            return input;
        char[] ch=input.toCharArray();
        char temp;
        temp=ch[0];
        ch[0]=ch[input.length()-1];
        ch[input.length()-1]=temp;

        return  String.valueOf(ch);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your String:");
        String input= scanner.next();
        System.out.println(swapFirstLast(input));
        System.out.println(swapFirstLastUsingSwap(input));
    }
}
