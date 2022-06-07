package org.gfk.strings;

import java.util.Scanner;

public class RemoveExtraDelimsFromString {
    static String removeDelims(String input,char delims){
        int index=input.lastIndexOf(delims);
        input=input.substring(0,index)+input.substring(index+1);
        return input;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your input:->");
        String input=sc.next();
        System.out.println("Enter your delims:->");
        char delims=sc.next().charAt(0);
        System.out.println(removeDelims(input,delims));
    }
}
