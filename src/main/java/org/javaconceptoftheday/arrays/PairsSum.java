package org.javaconceptoftheday.arrays;

public class PairsSum {
    public static void main(String[] args) {
        int[] arr={4, 5, 7, 11, 9, 13, 8, 12};
        int sum=20;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum)
                    System.out.println("pair is ("+arr[i]+","+arr[j]+")");
            }
        }
    }
}
