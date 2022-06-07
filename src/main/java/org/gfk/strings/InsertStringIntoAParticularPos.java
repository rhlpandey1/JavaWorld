package org.gfk.strings;

import java.util.Scanner;

public class InsertStringIntoAParticularPos {
    public static void main(String[] args) {
        Scanner scanner;
        scanner=new Scanner(System.in);
        System.out.println("Enter the original String :");
        String str1=scanner.next();
        System.out.println("Enter the String to be inserted");
        String str2=scanner.next();
        System.out.println("Enter the position :");
        int pos=scanner.nextInt();
        String output=str1.substring(0,pos).concat(str2).concat(str1.substring(pos));
        System.out.println("Output is :"+output);

        //using StringBuffer
       /* StringBuffer sb=new StringBuffer();
        sb.append("Hello");
        sb.insert(3,"Geeks");
        System.out.println(sb);*/

    }
}
