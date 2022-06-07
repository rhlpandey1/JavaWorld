package org.gfgPractice.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WaveArray {
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,7,8,9,10};

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1])
                swap(arr,i,i+1);
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
