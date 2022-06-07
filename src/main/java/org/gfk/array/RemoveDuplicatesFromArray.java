package org.gfk.array;

import java.util.*;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,7,9,1,1,1,1,1,4,4,7};
       // int[] arr={ 1, 1, 2, 2, 2 };
      /*  Set<Integer> set=new TreeSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println(Arrays.toString(set.toArray()));*/

        //using array looping
        /*int count=0;
        int n=arr.length;
        int[] temp=new int[n];
        for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1])
                temp[count++]=arr[i];
        }
        temp[count++]=arr[n-1];
        for(int i=0;i<count;i++)
            arr[i]=temp[i];

        for(int i=0;i<count;i++)
            System.out.println(arr[i]);*/

        Map<Integer,Boolean> map=new HashMap<>();
        int n=arr.length;
        for (int i = 0; i < n; ++i) {

            // Print the element if it is not
            // present there in the hash map
            // and Insert the element in the hash map
            if (map.get(arr[i]) == null)
            {
                System.out.print(arr[i] + " ");
                map.put(arr[i], true);
            }
        }
    }
}
