package org.gfgPractice.arrays;

import java.util.HashMap;
import java.util.Map;

public class CountPairsWithGivenSum {
    static int getPairsCount(int[] arr, int n, int k) {
        // code here
        //O(n^2)
        //
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==k)
                    count++;
            }
        }
        return count;
    }
    static int getPairsCountEff(int[] arr, int n, int k) {
        // code here
        //O(n)
        //
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(k-arr[i]))
                count=count+map.get(k-arr[i]);
            if(map.containsKey(arr[i])){
                int c=map.get(arr[i]);
                map.put(arr[i],++c);
            }
            else
                map.put(arr[i],1);
        }
        return count;
    }
    public static void main(String[] args) {
        int N = 4, K = 2;
        int arr[] = {1, 1, 1, 1};
        System.out.println(getPairsCountEff(arr,N,K));
    }
}
