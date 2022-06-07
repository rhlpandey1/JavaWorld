package org.javaconceptoftheday.arrays;

import java.util.Arrays;

public class InsertionAndDeletion {
    public static void main(String[] args) {
        int[] arr={1,4,7,8,9};
        int key=2;
        int value=2;
        //insertion
        int[] arr1=new int[arr.length+1];
        for(int i=0;i<key-1;i++)
        {
            arr1[i]=arr[i];
        }
        arr1[key-1]=value;
        for(int i=key;i<arr1.length;i++)
        {
            arr1[i]=arr[i-1];
        }

        System.out.println(Arrays.toString(arr1));

        //deletion
        int[] arr2=new int[arr1.length-1];
        for(int i=0;i<key-1;i++)
        {
            arr2[i]=arr1[i];
        }
        for(int i=key-1;i<arr2.length;i++)
        {
            arr2[i]=arr1[i+1];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
