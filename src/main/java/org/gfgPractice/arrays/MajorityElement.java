package org.gfgPractice.arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    private static void findMajority(int[] arr)
    {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int count = map.get(arr[i]) +1;
                if (count > arr.length /2) {
                    System.out.println("Majority found :- " + arr[i]);
                    return;
                } else
                    map.put(arr[i], count);

            }
            else
                map.put(arr[i],1);
        }
        System.out.println(" No Majority element");
    }
    static int majorityElement(int a[], int size)
    {
        int major = 0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<size;i++){
            if(map.containsKey(a[i])){
                int count=map.get(a[i]);
                count++;
                if(count>size/2)
                    major= a[i];
                else
                    map.put(a[i],count);
            }
            else
                map.put(a[i],1);
            }
        return major;
    }
    public static void main(String[] args) {
        int N = 1;
        int A[] = {15};
        System.out.println(majorityElement(A,N));
        findMajority(A);
    }
}
