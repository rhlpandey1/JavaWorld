package org.javaconceptoftheday.arrays;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr={1,3,4,1,2,7,2};
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int count=map.get(arr[i]);
                count++;
                map.put(arr[i],count);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>1)
                System.out.println("The character "+entry.getKey()+" repeated "+entry.getValue()+" times");
        }
    }
}
