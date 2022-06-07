package org.gfgPractice.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveNegativeElementsToTheEnd {
    public static void segregateElements(int arr[], int n)
    {
        // Your code goes here
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]>0)
                pos.add(arr[i]);
            else
                neg.add(arr[i]);
        }
        int i=0,j=0,k=0;
        while(i<pos.size()){
            arr[k++]= pos.get(i++);
        }
        while(j<neg.size()){
            arr[k++]= neg.get(j++);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[] = {1, -1, 3, 2, -7, -5, 11, 6 };
        int n=8;
        segregateElements(arr,n);
    }
}
