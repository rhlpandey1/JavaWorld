package org.gfk.strings;


import java.util.ArrayList;
import java.util.List;

public class ArrayListToString {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        list.add("Hi");
        list.add("hello");
        list.add("hru");
        //using streams
        list.stream().forEach(s-> System.out.println(s));
        //end

        for(String str:list){
            System.out.print(str+",");
        }

        System.out.println("***************");

        for(String str:list){
            sb.append(str).append(",");
        }
        if(sb.length()>0)
          System.out.println(sb.substring(0,sb.length()-1));

        String str=String.join(",",list);
        System.out.println(str);
    }
}
