package org.gfk.array;

import java.util.Arrays;
import java.util.Collections;

public class MaxAndMinSum {
    public static void main(String[] args) {
        int array[] = {13, 11, 45, 32, 89, 21 };
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int minSum=0;
        int maxSum=0;
        for(int i=0;i<array.length-1;i++){
            minSum+=array[i];
        }
        for(int i=array.length-1;i>0;i--){
            maxSum+=array[i];
        }
        System.out.println("Min sum is "+minSum);
        System.out.println("Max sum is "+maxSum);
    }
}
