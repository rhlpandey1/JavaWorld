package MorganStanely.round1;

import java.util.Arrays;

public class ArrayProductOfTheOtherEements {

    public static void main(String[] args) {
        int []arr={1,2,3,4};
        //arr[i] ->
        //{24,12,8,6}
        int n=arr.length;
        int[] arr1=new int[n];
        for(int i=0;i<arr.length;i++){
            int prod = 1;
            for(int j=0;j<n;j++){
                if (i != j)
                    prod = prod * arr[j];
            }
            arr1[i]=prod;
        }
        System.out.println(Arrays.toString(arr1));

        //optimized way
        int prd=1;
        int[] prdArr=new int[arr.length];
        for(int i:arr){
           prd*=i;
        }
        System.out.println(prd);
        for(int i=0;i<n;i++){
            prdArr[i]=prd/arr[i];
        }
        System.out.println(Arrays.toString(prdArr));
    }
}
