package org.gfk.strings;

import java.util.Scanner;

public class PrintAllPalindromicSubStrings {
    static void getPalindromicSubs(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String sub=str.substring(i,j);
                String str1="";
                if(sub.length()==1)
                    System.out.println("Palindromic Substring is :->"+sub);
                else{
                    for(int k=sub.length()-1;k>=0;k--){
                        str1+=sub.charAt(k);
                    }
                    if(str1.equalsIgnoreCase(sub))
                        System.out.println("Palindromic Substring is :->"+sub);
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your String:");
        String input= scanner.next();
        getPalindromicSubs(input);
    }
}
