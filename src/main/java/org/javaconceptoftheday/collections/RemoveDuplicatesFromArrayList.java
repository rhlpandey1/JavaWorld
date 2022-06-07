package org.javaconceptoftheday.collections;

import java.util.*;

public class RemoveDuplicatesFromArrayList {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,4,5,2,3,6,7,1);
        Set<Integer> set=new HashSet<>(list);
        List<Integer> list1=new ArrayList<>(set);
        System.out.println(list1);
    }
}
