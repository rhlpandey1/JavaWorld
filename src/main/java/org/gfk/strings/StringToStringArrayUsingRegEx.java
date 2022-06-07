package org.gfk.strings;

import java.util.Arrays;
import java.util.Scanner;

public class StringToStringArrayUsingRegEx {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string :");
        String str=scanner.nextLine();
        String[] str1=str.split("\\W");
        //way1
        System.out.println(Arrays.toString(str1));
        //way 2
        System.out.print("[");
        for(String ip:str1){
            System.out.print(ip+",");
        }
        System.out.print("]");
    }
}
