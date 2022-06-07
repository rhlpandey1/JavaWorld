package org.gfgPractice.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequenciesInLimitedRange {
    public static void main(String[] args) {
        int arr[] = {3,3,3,3};
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i< arr.length;i++){
            if(map.containsKey(arr[i])){
                int count=map.get(arr[i]);
                map.put(arr[i],++count);
            }
            else
                map.put(arr[i],1);
        }
        System.out.println(map);
        int[] arr1=new int[arr.length];
        for(int i=1;i<=3;i++){
            if(map.containsKey(i))
                arr1[i-1]=map.get(i);
            else
                arr1[i-1]=0;
        }

        System.out.println(Arrays.toString(arr1));
    }
}
