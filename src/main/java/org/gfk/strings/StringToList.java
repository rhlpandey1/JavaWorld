package org.gfk.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringToList {
    public static void main(String[] args) {
        String str="Hi Hello World";
        String str1[]=str.split("\\W");
        List<String> list=new ArrayList<>(Arrays.asList(str1));
        System.out.println(list);

        for(int i=0;i<str1.length;i++){
            list.add(str1[i]);
        }
        System.out.println(list);
    }
}
