package org.gfk.strings;

import java.util.Scanner;

public class PangramStringCheck {
    static void checkPangram(String input){
        input=input.toLowerCase();
        int count=0;
        for(char ch='a';ch<='z';ch++){
          if(!input.contains(String.valueOf(ch))){
              count++;
          }
        }
        if(count>0)
            System.out.println("Not Pangram");
        else
            System.out.println("Pangram");
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your String:");
        String input= scanner.next();
        checkPangram(input);
    }
}
