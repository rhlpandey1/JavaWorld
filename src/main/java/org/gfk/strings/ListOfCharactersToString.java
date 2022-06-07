package org.gfk.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfCharactersToString {
    public static void main(String[] args) {
        List<Character> lc= Arrays.asList('r','a','h','u','l');
        String str="";
        for(char c:lc)
        {
            str+=c;
        }
        System.out.println(str);
    }
}
