package org.javaconceptoftheday.arrays;

import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        //left rotation
        int[] arr={1, 2, 3, 4, 5, 6, 7};
        int start=2;
        int count=0;
        int arr1[]=new int[arr.length];
        for(int i=start;i<arr.length;i++){
            arr1[count++]=arr[i];
        }
        System.out.println(Arrays.toString(arr1));
        int count1=0;
        for(int i=count;i<arr.length;i++){
            arr1[i]=arr[count1++];
        }
        System.out.println(Arrays.toString(arr1));

    }
}
