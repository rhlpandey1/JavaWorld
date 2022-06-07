package org.javaconceptoftheday.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={4, 5, 8, 9, 10};
        List<Integer> list=Arrays.asList(4, 5, 8, 9, 10);
        Collections.reverse(list);
        System.out.println(Arrays.toString(list.toArray()));
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
