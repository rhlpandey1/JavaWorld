package org.javaconceptoftheday.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonElementBetweenTwoArrays {
    public static void main(String[] args) {
        int[] arr1={1,2,3,6,5,7};
        int[] arr2={3,4,6};

        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();

        for(int i:arr1)
            set1.add(i);
        for(int i:arr2)
            set2.add(i);
        set1.retainAll(set2);
        System.out.println(Arrays.toString(set1.toArray()));
    }
}
