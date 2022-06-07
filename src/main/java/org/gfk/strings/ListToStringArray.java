package org.gfk.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToStringArray {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Hi");
        list.add("hello");
        String[] str=new String[list.size()];
        for(int i=0;i<list.size();i++){
            str[i]=list.get(i);
        }
        System.out.println(Arrays.toString(str));
    }
}
