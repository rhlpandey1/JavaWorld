package org.gfk.array;

import java.util.Arrays;

public class IncrementAllElementsByOne {
    public static void main(String[] args) {
        int[] arr={1,5,46,6,24,23,23,4,10};
        for(int i=0;i<arr.length;i++)
            arr[i]=arr[i]+1;
        System.out.println(Arrays.toString(arr));
        //using stream
       int[] arr1= Arrays.stream(arr).filter(s->{
            s+=1;
            return true;
        }).toArray();
        System.out.println(Arrays.toString(arr1));
    }
}
