package org.gfgPractice.arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given an unsorted array Arr of N positive and negative numbers.
 * Your task is to create an array of alternate positive and negative numbers]
 * without changing the relative order of positive and negative numbers.
 * Note: Array should start with positive number.
 * Input:
 * N = 9
 * Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2}
 * Output:
 * 9 -2 4 -1 5 -5 0 -3 2
 */
public class AlternatePositiveAndNegative {
    static void rearrange(int[] arr, int n) {

        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            if (arr[i] < 0)
                neg.add(arr[i]);
            else
                pos.add(arr[i]);
        }

        int i = 0, j = 0, k = 0;
        while (i < neg.size() && j < pos.size()) {
            arr[k++] = pos.get(j++);
            arr[k++] = neg.get(i++);
        }
        while (j < pos.size()) { arr[k++] = pos.get(j++); }

        while (i < neg.size()) { arr[k++] = neg.get(i++); }
        System.out.println(Arrays.toString(arr));
    }
    static void reArrangeWithoutMaintainingOrder(int[] Arr, int n){
        int i=-1,temp;
        //moving all the positive numbers to the end
        for(int j=0;j<n;j++){
            if(Arr[j]<0){
                i++;
                temp=Arr[i];
                Arr[i]=Arr[j];
                Arr[j]=temp;
            }
        }
        //will swap each alternate negative numbers with a positive number
        //positive index will start from total number of negatives plus 1
        int pos=i+1,neg=0;
        while(pos<n && neg<pos  && Arr[neg]<0){
            temp=Arr[neg];
            Arr[neg]=Arr[pos];
            Arr[pos]=temp;
            pos++;
            neg+=2;
        }

        System.out.println(Arrays.toString(Arr));
    }
    public static void main(String[] args) {
        int[] Arr = {9, 4, -2, -1, 5, 0, -5, -3, 2};
        int n=Arr.length;
        rearrange(Arr,n);
        reArrangeWithoutMaintainingOrder(Arr,n);
    }
}
