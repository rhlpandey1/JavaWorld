package org.gfgPractice.arrays;

public class MinMax {
    static void getMinMax(long a[], long n)
    {
        //Write your code here
        long min=a[0];
        long max=a[(int) (n-1)];
        for(int i=0;i<n;i++){
            min=Math.min(min,a[i]);
            max=Math.max(max,a[i]);
        }
    }
    public static void main(String[] args) {

    }
}
