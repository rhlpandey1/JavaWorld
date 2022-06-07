package org.gfk.strings;

import java.util.Scanner;

public class InsertStringIntoAnotherString {
    static String insertString(String str,String insert,int i){
       // return  str.substring(0,i+1)+insert+str.substring(i+1);
        StringBuffer sb=new StringBuffer(str);
        return  sb.insert(i+1,insert).toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your input:->");
        String input=sc.next();
        System.out.println("Enter the String to be inserted:->");
        String insert=sc.next();
        System.out.println("Enter the index");
        int index=sc.nextInt();
        System.out.println(insertString(input,insert,index));
    }
}
