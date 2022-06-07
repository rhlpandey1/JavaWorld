package org.gfgPractice.arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepeatingElementIndex {
    public static void main(String[] args) {
        Map<Integer,Integer> map=new LinkedHashMap<>();
        int[] arr={3,7,0,9};
        int n=4;
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i]))
            {
                int count=map.get(arr[i]);
                map.put(arr[i],++count);
            }
            else
                map.put(arr[i],1);
        }

        System.out.println(map);
        int rep=-1;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>1){
                rep=entry.getKey();
                break;
            }
        }
        int index=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==rep){
                index= i+1;
                break;
            }

        }
        System.out.println(index);
    }
}
