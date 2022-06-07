package org.sdetqa;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,7};
        int sum=28; //n*(n+1)/2 , n is the size of the array
        int sum1 = 0;
        for(int i=0;i<arr.length;i++)
            sum1+=arr[i];
        System.out.println("Sum "+sum1);
        int missing=sum-sum1;
        System.out.println("Missing number is "+missing);

    }
}
