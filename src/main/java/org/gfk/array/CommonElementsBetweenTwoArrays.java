package org.gfk.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonElementsBetweenTwoArrays {
    public static void main(String[] args) {
        String[] str1={"hi","hello","world","java"};
        String[] str2={"hi","hello"};
        System.out.println("Binary search     "+Arrays.binarySearch(str1,"world"));
        //way 1 more complexity o(n2)
        Set<String> set=new HashSet<>();
        for(int i=0;i<str1.length;i++){
            for(int j=i;j<str2.length;j++){
                if(str1[i].equals(str2[j]))
                    set.add(str1[i]);
            }
        }
        System.out.println(set);
        //way 2 (less complexity) o(n)
        Set<String> set1=new HashSet<>();
        Set<String> set2=new HashSet<>();
        for(int i=0;i<str1.length;i++){
            set1.add(str1[i]);
        }
        for(int i=0;i<str2.length;i++){
            set2.add(str2[i]);
        }
        set1.retainAll(set2);
        System.out.println(set1);

        int array[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        // Sorting the array
        Arrays.sort(array);
        // Using binarySearch to search for desired element
        int index = Arrays.binarySearch(array, 9);

        // Printing result
        if (index >= 0)
            System.out.println("Element 2 found at index: "
                    + index);
        else
            System.out.println("Element not found");

    }
}
