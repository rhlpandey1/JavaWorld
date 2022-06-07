package org.javaconceptoftheday.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContinuousSubArraySum {
    public static void main(String[] args) {
        int arr[]={12, 5, 31, 9, 21, 8};
        int sum=38;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[i]+arr[j]+arr[j+1]==sum){
                    System.out.println("sub array is {"+arr[i]+","+arr[j]+","+arr[j+1]+"}");
                    list.add(arr[i]);
                    list.add(arr[j]);
                    list.add(arr[j+1]);
                }
            }
        }
        System.out.println(Arrays.toString(list.toArray()));
    }
}
