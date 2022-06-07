package org.javaconceptoftheday.arrays;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MergeTwoArraysWithoutDuplicate {
    public static void main(String[] args) {
        //using Tree Set
        int[] arr1 = new int[] {7, -5, 3, 8, -4, 11, -19, 21};

        int[] arr2 = new int[] {6, 13, -7, 0, 11, -4, 3, -5};
       /* Set<Integer> set1=new TreeSet<>();
        Set<Integer> set2=new TreeSet<>();
        for(int x:arr1){
            set1.add(x);
        }
        for(int y:arr2){
            set2.add(y);
        }

        set1.addAll(set2);
        System.out.println("using set "+ Arrays.toString(set1.toArray()));*/

        int n1=arr1.length;
        int n2=arr2.length;
        int n=n1+n2;
        int arr3[]=new int[n];
        int i=0;
        int j=0;
        int k=0;
        while(i<n1){
            arr3[k++]=arr1[i++];
        }
        while(j<n2){
            arr3[k++]=arr2[j++];
        }
        //merge unsorted arrays with duplicates
        System.out.println(Arrays.toString(arr3));
        //sort the merged arrays
        Set<Integer> set=new TreeSet<>();
        for(int m:arr3)
            set.add(m);
        System.out.println(set);

    }
}
