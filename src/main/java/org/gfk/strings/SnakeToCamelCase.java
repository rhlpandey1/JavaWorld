package org.gfk.strings;

import java.util.Scanner;

public class SnakeToCamelCase {
    static String snakeToCamel(String input){
        input=String.valueOf(input.charAt(0)).toUpperCase().concat(input.substring(1));
        StringBuilder sb=new StringBuilder(input);
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='_'){
                sb.deleteCharAt(i);
                sb.replace(i,i+1,String.valueOf(Character.toUpperCase(sb.charAt(i))));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your String:");
        String input= scanner.next();
        System.out.println(snakeToCamel(input));

    }
}
