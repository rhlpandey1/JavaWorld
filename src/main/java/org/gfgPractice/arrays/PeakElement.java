package org.gfgPractice.arrays;

public class PeakElement {
    public static void main(String[] args) {
        int N = 3;
        int arr[] = {1,2,3};
        int peak=N-1;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i+1]<arr[i]){
                peak=i;
                break;
            }
        }
        System.out.println(peak);
    }
}
