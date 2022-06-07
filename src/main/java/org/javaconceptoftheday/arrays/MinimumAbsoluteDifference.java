package org.javaconceptoftheday.arrays;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        int arr[]={5, -3, 7, -2};
        int min=Math.abs(arr[1]-arr[0]);
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int abs=Math.abs(arr[i]-arr[j]);
                if(abs<min)
                    min=abs;
            }

        }
        System.out.println("Minimum absolute difference is "+min);
    }
}
