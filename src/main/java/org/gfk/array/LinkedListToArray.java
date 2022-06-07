package org.gfk.array;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class LinkedListToArray {
    public static void main(String[] args) {
        List<String> list=new LinkedList<>(Arrays.asList("R","A","H","U","L"));
        //way1
        String[] str=new String[list.size()];
       for(int i=0;i<list.size();i++)
           str[i]=list.get(i);
        System.out.println(Arrays.toString(str));
        //way2
        String str1[]=Arrays.copyOf(list.toArray(),list.size(),String[].class);
        System.out.println(Arrays.toString(str1));

        //way 3 :-> Java 8
        String[] str2= list.stream().toArray(String[]::new);
        System.out.println(Arrays.toString(str2));
    }
}
