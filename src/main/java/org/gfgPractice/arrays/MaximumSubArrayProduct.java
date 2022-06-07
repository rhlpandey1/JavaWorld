package org.gfgPractice.arrays;

public class MaximumSubArrayProduct {
    static  long maxProduct(int[] arr, int n) {

        int max=arr[0];
        for(int i=0;i<n;i++){
            int prod=arr[i];
            for(int j=i+1;j<n;j++){
                max=Math.max(prod,max);
                prod=prod*arr[j];
            }
            max=Math.max(prod,max);
        }
        return max;
    }
    public static void main(String[] args) {
        int Arr[] = {8 ,-2 ,-2, 0, 8 ,0 ,-6 ,-8 ,-6 ,-1};
        System.out.println(maxProduct(Arr,10));
    }
}
