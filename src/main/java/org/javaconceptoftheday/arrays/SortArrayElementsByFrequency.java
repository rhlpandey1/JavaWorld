package org.javaconceptoftheday.arrays;

import java.util.*;

public class SortArrayElementsByFrequency {
    public static void main(String[] args) {
        int[] arr={7, 1, 3, 4, 7, 1, 7, 1, 4, 5, 1, 9, 3};

        Map<Integer,Integer> map=new LinkedHashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int count=map.get(arr[i]);
                count++;
                map.put(arr[i],count);
            }else
                map.put(arr[i],1);
        }
        System.out.println(map);
        //Construct an ArrayList holding all Entry objects of map
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        ////Sort list based on values i.e. count
        Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        System.out.println("Input array "+Arrays.toString(arr));
        System.out.println("After sorting by frequency");
        System.out.print("[");
        for(Map.Entry<Integer,Integer> entry:list){
            int frequency=entry.getValue();
            while(frequency>=1){
                System.out.print(entry.getKey()+" ");
                frequency--;
            }
        }
        System.out.print("]");
    }
}
