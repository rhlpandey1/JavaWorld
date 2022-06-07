package org.gfgPractice.arrays;

import java.util.ArrayList;

public class SubArraySum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here

        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            int sum=arr[i];
            for(int j=i+1;j<=n;j++){
              //  sum=sum+arr[i]+arr[j];
                if(sum==s){
                    int p=j-1;
                    list.add(i);
                    list.add(p);
                    return list;
                }
                if (sum > s || j == n)
                    break;
                sum = sum + arr[j];
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int N = 5, S = 12;
       int A[] = {1,2,3,7,5};
        System.out.println(subarraySum(A,N,S));
    }
}
