package org.gfgPractice.arrays;

import java.util.Arrays;

public class RotateArray {
    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        int temp = 0;
        for(int i=0;i<d;i++){
            temp=arr[0];
            for(int j=0;j<n-1;j++){
                arr[j]=arr[j+1];
            }
            arr[n-1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    static void rightRotateArr(int arr[], int d, int n)
    {
        // add your code here
        for(int i=0;i<d;i++){
            int temp = arr[n-1];
            for(int j=n-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int N = 5, D = 4;
        int  arr[] = {1,2,3,4,5};
      //  rotateArr(arr,D,N);
        rightRotateArr(arr,D,N);
    }
}
