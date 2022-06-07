package org.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class FindPairs {
    public static void main(String[] args) {
        int []ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int n=9;
        Map<Integer,Integer> map=new HashMap<>();
        int count;
        for(int i=0;i<n;i++){
            if(map.containsKey(ar[i]))
            {
                count=map.get(ar[i]);
                count++;
                map.put(ar[i],count);
            }
            else
                map.put(ar[i],1);
        }
        int pair=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int key=entry.getKey();
            int val= entry.getValue()/2;
            System.out.println("Pairs of "+key+" are"+ val);
            pair+=val;
        }
        System.out.println(pair);
    }
}
