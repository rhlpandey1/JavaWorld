package org.javaconceptoftheday.arrays;

import java.util.Arrays;

public class SecondLargestInAnIntegerArray {
    public static void swap(int arr[],int i,int j){
        if(i==j)
            return;
        else{
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

    }
    public static void main(String[] args) {
        int []arr1={1,2,3,4,6,23,24,13,89,45};
      /*  Arrays.sort(arr1);*/
        //bubble sorting
        /*for(int i=0;i<arr1.length-1;i++){
            for( int j=0;j<arr1.length-i-1;j++){
                if(arr1[j]>arr1[j+1])
                    swap(arr1,j,j+1);
            }
        }
        */
        //selection sort
        /*for(int i=0;i<arr1.length;i++){
            int min=i;
            for(int j=0;j<arr1.length;j++){
                if(arr1[j]<arr1[min])
                    min=j;

            }
            swap(arr1,i,min);
        }*/
        //insertion sort
        for(int i=1;i<arr1.length;i++){
            int key=arr1[i];
            int j=i-1;
                while(j>=0 && arr1[j]>key){
                    arr1[j+1]=arr1[j];
                    j=j-1;
                }
            arr1[j+1]=key;

        }
        System.out.println(arr1[arr1.length-2]);
    }
}
