package org.gfk.strings;

import java.util.Scanner;
//JavaDev->aJaveDv
public class SwapPairsOfChars {
    static String swapPairs(String str){
        int length=str.length();
        char[] ch=str.toCharArray();
        char t;
        if (str == null || str.isEmpty())
            return str;
        for(int i=0;i<length-1;i+=2){
            t=ch[i];
            ch[i]=ch[i+1];
            ch[i+1]=t;
        }
        return String.valueOf(ch);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your String:");
        String input= scanner.next();
        System.out.println(swapPairs(input));
    }

}
