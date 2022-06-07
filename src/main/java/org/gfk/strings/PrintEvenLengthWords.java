package org.gfk.strings;

import java.util.Scanner;

public class PrintEvenLengthWords {
    static void printEvenLengthWordsInString(String str){
        String[] str1=str.split("\\W");
        for(int i=0;i<str1.length;i++){
            if(str1[i].length()%2==0)
                System.out.println(str1[i]);

        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your String:");
        String input= scanner.nextLine();
        printEvenLengthWordsInString(input);
    }
}
