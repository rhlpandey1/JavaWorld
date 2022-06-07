package org.gfk.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddAndEvenPositionElementsInSeparateArrays {
    public static void main(String[] args) {
        int[] arr={ 23, 55, 54, 9, 76, 66, 2, 91 };
        int length=arr.length;
        int oC = 0;
        int eC = 0;
        for(int i=0;i<length;i++){
            if(arr[i]%2==0)
                eC++;
            else
                oC++;
        }
        int[] arr1 = new int[eC];
        int[] arr2= new int[oC];
        /*List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();*/
        int j = 0,k=0;
        for(int i=0;i<length;i++){
            if(arr[i]%2==0)
               arr1[j++]=arr[i];
            else
                arr2[k++]=arr[i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

}
