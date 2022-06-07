package org.gfk.strings;

import java.util.ArrayList;
import java.util.List;

public class StringToListOfCharacters {
    public static void main(String[] args) {
        String str="Rahul";
        List<Character> list=new ArrayList<>();
        for(int i=0;i<str.length();i++)
            list.add(str.charAt(i));
        System.out.println(list);
        System.out.println(str.charAt(3));
    }
}
