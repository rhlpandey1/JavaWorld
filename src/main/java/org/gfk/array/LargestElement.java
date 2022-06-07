package org.gfk.array;

import java.util.Arrays;

public class LargestElement {
    public static int largest(int arr[], int n)
    {
        if(n==1)
            return arr[0];
        else
            Arrays.sort(arr);
        //System.out.println(arr[n-1]);
        return arr[n-1];
    }
    public static int largestUsingSort(int arr[], int n)
    {
        int t;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        return arr[n-1];
    }
    public static void main(String[] args) {
        int A[] = {1, 2, 0, 3, 2, 4, 5};
        int n=7;
        System.out.println(largest(A,n));
        System.out.println(largestUsingSort(A,n));
        //using Java 8
        long max=Arrays.stream(A).max().getAsInt();
        System.out.println(max);
    }
}
