package org.gfk.array;

import java.util.Arrays;

public class InsertElementAtSpecificIndex {
    public static void main(String[] args) {
        int array[] = { 10, 8, 7, 6,3,17,12,13,4,9 };
        int key=3;
        int value=33;
        int[] arr=new int[array.length+1];
        for(int i=0;i<key-1;i++)
            arr[i]=array[i];
        arr[key-1]=value;
        for(int i=key;i<arr.length;i++){
            arr[i]=array[i-1];
        }

        System.out.println(Arrays.toString(arr));
    }
}
