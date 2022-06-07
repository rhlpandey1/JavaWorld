package org.gfgPractice.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MissingAndRepeatingNumber {
    public static void main(String[] args) {
        int[] arr={1, 3, 3};
        int[] arr1=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int count=map.get(arr[i]);
               // count++;
                map.put(arr[i],++count);
            }
            else
                map.put(arr[i],1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()>1){
                arr1[0]=entry.getKey();
            }
        }
        for (int i=1;i<=arr.length;i++){
            if(!map.containsKey(i))
            {
                arr1[1]=i;
                break;
            }
        }

        System.out.println(Arrays.toString(arr1));
    }
}
