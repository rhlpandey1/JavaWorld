package org.gfgPractice.arrays;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWith0Sum {
    static boolean findsum(int arr[],int n)
    {
        boolean flag=false;
        Set<Integer> hs = new HashSet<>();
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            if (arr[i] == 0
                    || sum == 0|| hs.contains(sum))
                flag=true;

            hs.add(sum);
        }
        return flag;
    }
    public static void main(String[] args) {
        int[] arr={4 ,2 ,-3, 1, 6};
        System.out.println(findsum(arr,arr.length));
        for(int i:arr){
            if(i==0){
                System.out.println("Yes");
                break;
            }
        }
        for(int i=0;i<arr.length;i++){
            int sum=arr[i];
            for(int j=i+1;j<arr.length;j++){
                sum=sum+arr[j];
                if  (sum==0){
                    System.out.println("Yes");
                    break;
                }
            }
        }
    }
}
