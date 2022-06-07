package org.gfk.strings;

import java.util.Scanner;

public class SwapCornerWordsAndReverseMiddleCharacters {
    static String swapAndReverse(String input){
        String[] str=input.split("\\W");
        String beg=str[0];
        String end=str[str.length-1];
        String str1=input.replace(beg,"").replace(end,"");
        StringBuilder sb=new StringBuilder(str1);
        sb.reverse();
        return end+sb+beg;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your String:");
        String input= scanner.nextLine();

        System.out.println(swapAndReverse(input));
    }
}
