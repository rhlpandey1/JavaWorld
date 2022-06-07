package org.gfk.strings;

import java.util.Arrays;

public class ArraysToString {
    public static void main(String[] args) {
        String[] str={"Hi","Hello","HRW"};
        System.out.println(Arrays.toString(str));
        String str1="";

        for(String s:str){
            str1+=s;
        }
        System.out.println(str1);
        char[] ch={'R','a','h','u','l'};
        System.out.println(Arrays.toString(ch));
    }
}
