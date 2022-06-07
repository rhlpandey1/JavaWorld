package org.javaconceptoftheday.arrays;

import java.util.Arrays;

public class SeparateZeroes {
    public static void main(String[] args) {
        int[] arr={14, 0, 5, 2, 0, 3, 0};


        //zeroes to end
       /* int count=0;
       for(int i=0;i<arr.length;i++){
            if(arr[i]!=0)
                arr[count++]=arr[i];

        }
        for(int i=count;i<arr.length;i++)
            arr[i]=0;*/
   /*     int count=arr.length-1;
        for(int i=count;i>=0;i--){
            if(arr[i]!=0)
                arr[count--]=arr[i];

        }
        for(int i=count;i>=0;i--){
            arr[count--]=0;
        }*/

        //add all the zeroes at the beginning
        //then add the non zeroes
        int count=0;
        int[] arr1=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
                arr1[count++]=0;
        }
        System.out.println("zeroes "+count);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0)
                arr1[count++]=arr[i];
        }
        System.out.println(Arrays.toString(arr1));
    }
}
