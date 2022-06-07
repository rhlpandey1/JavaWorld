package org.gfk.array;

import java.util.*;
class Main{
    static void printSec(int arr[],int size){
        int i;
        if(size<2){
            System.out.println("Invalid INput");
            return;
        }
        Arrays.sort(arr);

        for(i =size-2;i>=0;i--){
            if(arr[i]!=arr[size-1]){
                System.out.println("Second Largest number in the array is"+arr[i]);
                return;
            }
        }

    }
    public static void main(String[] args){
        int arr[] ={2,7,8,9,0,12,56,30,29,55};
        int n = arr.length;
        printSec(arr,n);
    }
}
