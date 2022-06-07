package mmt;

import java.util.Arrays;

public class ArrayProductOfTheOtherElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        //arr[i] ->
        //{24,12,8,6}
        int n = arr.length;
        int[] arr1 = new int[n];
        for (int i = 0; i < arr.length; i++) {
            int prod = 1;
            for (int j = 0; j < n; j++) {

                if (i != j)
                    prod = prod * arr[j];
            }
            arr1[i] = prod;
        }
        System.out.println(Arrays.toString(arr1));
    }
}
