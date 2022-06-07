package org.gfk.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToList {
    public static <T> List<T> convertArrayToList(T array[])
    {
        // Create the List by passing the Array
        // as parameter in the constructor
        List<T> list = new ArrayList<>();
        // Add the array to list
        Collections.addAll(list, array);
        // Return the converted List
        return list;
    }
    public static void main(String[] args) {
        //way 1
        String[] str={"Rahul","Pandey"};
        List<String> list= Arrays.asList(str);
        System.out.println(list);
        //way 2
        List<String> list1=new ArrayList<>();
        for(String st:str){
            list1.add(st);
        }
        System.out.println(list1);
        //way 3
        Integer[] arr={1,2,3,4};
        System.out.println(convertArrayToList(arr));
    }
}
