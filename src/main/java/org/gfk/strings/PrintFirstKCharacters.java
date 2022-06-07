package org.gfk.strings;

import java.util.Scanner;

public class PrintFirstKCharacters {
    static void printFirstKChars(String str,int k){
        String op;
        if(str==null ||str.isEmpty())
            System.out.println("null");
        if(k>=str.length())
                System.out.print(str);
        else{
            str=str.substring(0,k);
            System.out.println(str);
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your String:");
        String input= scanner.next();
        System.out.println("Enter the number of characters to be printed:");
        int k=scanner.nextInt();
        printFirstKChars(input,k);

    }
}
