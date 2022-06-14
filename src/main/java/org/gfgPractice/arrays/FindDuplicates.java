package org.gfgPractice.arrays;

import java.util.*;

public class FindDuplicates {
    public static List<Integer> duplicates(int arr[], int n) {
        // code here
        Map<Integer,Integer> map=new LinkedHashMap<>();
        List<Integer> list=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])) {
                int count=map.get(arr[i]);
                map.put(arr[i],++count);
            }
            else
                map.put(arr[i],1);
        }
        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
            if(entry.getValue()>1)
                list.add(entry.getKey());
        }
        return list;
    }
    public static void main(String[] args) {
        int a[] = {13,9,25,1,1,0,22,13,22,20,3,8,11,25,10,3,15,11,19,20,2,4,25,14,23,14};
        System.out.println(duplicates(a,a.length));
    }
}
