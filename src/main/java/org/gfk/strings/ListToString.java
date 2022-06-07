package org.gfk.strings;

import java.util.ArrayList;
import java.util.List;

public class ListToString {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Hi");
        list.add("hello");
        System.out.print("[");

        for(String str:list){
            System.out.print(str+",");
        }
        System.out.print("]");
        System.out.println();
        String str=String.join(",",list);
        System.out.println(str);
    }
}
