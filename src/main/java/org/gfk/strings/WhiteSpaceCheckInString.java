package org.gfk.strings;

import java.util.Scanner;

public class WhiteSpaceCheckInString {
    static boolean checkWhiteSpace(String str){
        str=str.trim();
        if(str.isEmpty())
            return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(checkWhiteSpace(""));
    }
}
