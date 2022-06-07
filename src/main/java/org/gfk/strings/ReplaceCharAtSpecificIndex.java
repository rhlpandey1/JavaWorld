package org.gfk.strings;

import java.util.Scanner;

public class ReplaceCharAtSpecificIndex {
    static String replaceChar(String str,int index,char ch){
        return str.substring(0,index)+ch+str.substring(index+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your input :->");
        String input=sc.nextLine();
        System.out.println("Enter your index :->");
        int index=sc.nextInt();
        System.out.println("Enter the character:->");
        char ch=sc.next().charAt(0);
        System.out.println(replaceChar(input,index,ch));

    }
}
