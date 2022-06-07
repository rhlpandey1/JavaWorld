package org.gfk.strings;

import java.util.Scanner;

//Check if a string contains only alphabets in Java
//Input: GeeksforGeeks
//Output: true
public class StringContainingOnlyDigits {
    static boolean checkCharacters(String str){
        for(int i=0;i<str.length();i++){
            if(!Character.isDigit(str.charAt(i)))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your String:");
        String input= scanner.next();
        System.out.println(checkCharacters(input));
    }
}
