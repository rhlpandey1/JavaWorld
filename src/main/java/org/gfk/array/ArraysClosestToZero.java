package org.gfk.array;

import java.util.Arrays;

public class ArraysClosestToZero {
    public static void main(String[] args) {
        int []arr={1,2,5,6,7,3,-3,-1};
        int min=arr[0];
        int cur=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
             cur=arr[i]*arr[i];
            if(cur<min*min)
            {
                min=arr[i];
            }
        }
        System.out.println(min);
        System.out.println("Minimum is :"+Math.abs(min));
    }
}
