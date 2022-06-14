package org.gfgPractice.arrays;

import java.util.Arrays;

public class SortArrayOf012 {
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void sort012(int a[], int n)
    {
        int low=0;int mid=0; int high=n-1;
        while(mid<=high){
            if(a[mid]==0){
                swap(a,low,mid);
                low++;
                mid++;
            }
            else if(a[mid]==1)
                mid++;
            else {
                swap(a,mid,high);
                high--;
            }
        }

    }
    public static void main(String[] args) {
        int arr[]= {0 ,1 ,2 ,0,1,1,1,2,2,0};
        sort012(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
