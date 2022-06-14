package org.gfgPractice.arrays;

import java.util.HashSet;

public class CheckDuplicatesWithinKthDistance {
   static boolean checkDuplicatesWithinK(int[] arr, int n, int k) {
        // code here
       HashSet<Integer> set = new HashSet<>();

       // Traverse the input array
       for (int i=0; i<arr.length; i++)
       {
           // If already present n hash, then we found
           // a duplicate within k distance
           if (set.contains(arr[i]))
               return true;

           // Add this item to hashset
           set.add(arr[i]);

           // Remove the k+1 distant item
           if (i >= k)
               set.remove(arr[i-k]);
       }
       return false;
    }
    public static void main(String[] args) {
       int  K = 3;
        int Arr[] = {1, 2, 3, 1, 4, 5};
        System.out.println(checkDuplicatesWithinK(Arr,Arr.length,K));
    }
}
