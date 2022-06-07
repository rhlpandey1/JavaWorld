package org.gfk.array;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ArrayToLinkedHashSet {
    public static void main(String[] args) {
        String[] arr={"Rahul","Pandey"};
       // Set<String> set=new LinkedHashSet<>(Arrays.asList(arr));
        Set<String> set=new LinkedHashSet<>(Arrays.asList(arr));
        set.stream().forEach(s-> System.out.println(s));
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println(set);
        Set<Integer> set1=new TreeSet<>(Arrays.asList(new Integer[]{1,2,2,3,4,7,9,1}));
        System.out.println(set1);
    }
}
