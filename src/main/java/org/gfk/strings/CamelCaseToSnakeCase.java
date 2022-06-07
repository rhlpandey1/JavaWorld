package org.gfk.strings;

import java.util.Scanner;

public class CamelCaseToSnakeCase {
    static String camelToSnake(String str){
        str=String.valueOf(str.charAt(0)).toLowerCase().concat(str.substring(1));
        String str1="";
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i)))
                str1+="_"+String.valueOf(str.charAt(i)).toLowerCase();
            else
                str1+=str.charAt(i);

        }
        return str1;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your String:");
        String input= scanner.next();
        System.out.println(camelToSnake(input));
    }
}
