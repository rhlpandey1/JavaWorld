package org.gfk.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortArrayInDescending {
    public static void main(String[] args) {
        int[] arr={1,5,46,6,24,23,23,4,10};
        int temp;
        //using sort() method
        /*Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));*/
        //using swap method :: conventional
   /*     for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));*/
        //using single loop
      /*  Arrays.parallelSort(arr);
        System.out.println(Arrays.toString(arr));*/
        for(int i=0;i<arr.length/2;i++){
            temp=arr[i];
            arr[i]=arr[arr.length-(i+1)];
            arr[arr.length-(i+1)]=temp;
        }
        System.out.println(Arrays.toString(arr));
        /*int[] arr1= Arrays.stream(arr).sorted(Comparator.reverseOrder()).mapToInt(x->x).toArray();
        System.out.println(Arrays.toString(arr1));*/
    }
}
