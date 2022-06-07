package org.gfk.array;

import java.util.Arrays;

public class RemoveAnElementFromASpecificIndex {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int index = 2;
        //way1
        int arr1[]=new int[arr.length-1];
        for(int i=0;i<index;i++)
            arr1[i]=arr[i];
        for(int i=index;i<arr1.length;i++)
            arr1[i]=arr[i+1];

        System.out.println(Arrays.toString(arr1));
        //way2
        System.arraycopy(arr,0,arr1,0,index);
        System.arraycopy(arr,index+1,arr1,index,arr1.length-index-1);
        System.out.println(Arrays.toString(arr1));
    }
}
