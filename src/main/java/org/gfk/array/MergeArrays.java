package org.gfk.array;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeArrays {
    public static void main(String[] args) {
        int arr1[] = { 1, 3, 4, 5};
        int arr2[] = {2, 4, 6, 8};
        int[] arr=new int[arr1.length+arr2.length];
        //using pre defined method
        System.arraycopy(arr1,0,arr,0,arr1.length);
        System.arraycopy(arr2,0,arr,arr1.length,arr2.length);
        //using conventional method
       /* for(int i=0;i<arr1.length;i++){
            arr[i]=arr1[i];
        }
        int count=0;

        for(int i=arr1.length;i<arr.length;i++){
            arr[i]=arr2[count];
            count++;
        }*/
        System.out.println(Arrays.toString(arr));
        //using java 8

        int[] arr3=IntStream.concat(IntStream.of(arr1),IntStream.of(arr2)).toArray();
        System.out.println(Arrays.toString(arr3));

    }
}
