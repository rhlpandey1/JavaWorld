package sixt.round1;

import java.lang.reflect.Array;
import java.util.*;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int arr1[]={1,3,5,7};
        int arr2[]={1,2,3,4,6,8,8,9};
        int n1=arr1.length;
        int n2=arr2.length;
        int arr3[]=new int[n1+n2];

        int i=0;
        int j=0;
        int k=0;
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j])
                arr3[k++]=arr1[i++];
            else
                arr3[k++]=arr2[j++];
        }
        while(i<n1)
            arr3[k++]=arr1[i++];
        while (j<n2)
            arr3[k++]=arr2[j++];
        System.out.println(Arrays.toString(arr3));

        //Using TreeMap
        Map<Integer,Integer> map=new TreeMap<>();
        for(int m=0;m<n1;m++){
            map.put(m,arr1[m]);
        }
        for(int m=0;m<n2;m++){
            map.put(m,arr2[m]);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.print(entry.getValue()+" ");
        }
        //using Tree Set
      /*  Set<Integer> set1=new TreeSet<>();
        Set<Integer> set2=new TreeSet<>();
        for(int x:arr1){
            set1.add(x);
        }
        for(int y:arr2){
            set2.add(y);
        }

        set1.addAll(set2);
        System.out.println("using set "+Arrays.toString(set1.toArray()));*/


    }
}
