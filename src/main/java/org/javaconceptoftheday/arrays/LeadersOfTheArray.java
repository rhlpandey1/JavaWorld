package org.javaconceptoftheday.arrays;

import java.util.ArrayList;
import java.util.List;

public class LeadersOfTheArray {
    public static void main(String[] args) {
        int[] arr={14, 9, 11, 7, 8, 5, 3};
        List<Integer> list=new ArrayList<>();
        boolean flag;
        for(int i=0;i<arr.length;i++){
                flag=true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i])
                {
                    flag=false;
                    System.out.println(arr[i]+" is not the leader");
                    break;
                }
            }
            if(flag){
                list.add(arr[i]);
            }
        }
        System.out.println("leaders list is "+list);
    }
}
