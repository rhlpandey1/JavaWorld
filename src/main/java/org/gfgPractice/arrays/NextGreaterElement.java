package org.gfgPractice.arrays;

import java.util.Arrays;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr={13, 7, 6, 12};
        int[] arr1=new int[arr.length];
        int count=0;
        for(int i=0;i<arr.length;i++){
            int next=-1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    next=arr[j];
                    break;
                }
            }
            arr1[count++]=next;
        }
        arr1[arr1.length-1]=-1;

        System.out.println(Arrays.toString(arr1));
    }

}
