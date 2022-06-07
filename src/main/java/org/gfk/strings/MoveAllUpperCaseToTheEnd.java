package org.gfk.strings;

import java.util.Scanner;

public class MoveAllUpperCaseToTheEnd {
    static String moveUpperToEnd(String input){
        String str1="";
        String str2="";
        for(int i=0;i<input.length();i++){
            if(Character.isUpperCase(input.charAt(i)))
            {
                str1+=input.charAt(i);
            }
            else
               // System.out.print(input.charAt(i));
                str2+=input.charAt(i);
        }
        return str2+str1;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your String:");
        String input= scanner.next();
        System.out.print(moveUpperToEnd(input));
    }
}
