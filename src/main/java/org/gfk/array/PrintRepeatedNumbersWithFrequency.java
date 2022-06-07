package org.gfk.array;

import java.util.HashMap;
import java.util.Map;

public class PrintRepeatedNumbersWithFrequency {
    public static void main(String[] args) {
        int arr[]={1,2,4,56,6,3,4,2,2,1};
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int count=map.get(arr[i]);
                count++;
                map.put(arr[i],count);
            }
            else
                map.put(arr[i],1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()!=1){
                System.out.println("Frequency of "+entry.getKey()+" is "+entry.getValue()+" Times");
            }

        }
    }
}
