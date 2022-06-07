package org.gfk.array;

import java.util.Arrays;
import java.util.Collections;

public class SmallestElementInAnArray {
    public static void main(String[] args) {
        int[] arr={10,3,4,5,7,89,2};
        int smallest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest)
                smallest=arr[i];
        }
        System.out.println(smallest);
        Arrays.sort(arr);
        System.out.println(arr[0]);
        Integer[] arr1={10,3,4,5,7,89,2};
        Arrays.sort(arr1, Collections.reverseOrder());
        System.out.println(arr1[arr1.length-1]);
        //Using Java 8
        smallest=Arrays.stream(arr).min().getAsInt();
        System.out.println("Smallest using stream "+smallest);
    }
}
