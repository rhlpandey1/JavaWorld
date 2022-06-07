package org.javaconceptoftheday.arrays;

public class FindMissingNumberInAnArray {
    public static void main(String[] args) {
        int arr[]={1, 4, 5, 3, 7, 8, 6};
        int n=8;
        int naturalSum=n*(n+1)/2;
        System.out.println(naturalSum);
        int actualSum=0;
        for(int i=0;i<arr.length;i++)
            actualSum+=arr[i];

        System.out.println("missing number is "+(naturalSum-actualSum));
    }
}
