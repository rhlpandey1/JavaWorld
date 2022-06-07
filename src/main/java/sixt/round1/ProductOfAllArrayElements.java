package sixt.round1;

import java.util.Arrays;

public class ProductOfAllArrayElements {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        //Approach 1
        int[] prd=new int[arr.length];
        int prod = 1;
        for(int i=0;i<arr.length;i++){
              prod=prod*arr[i];
        }
        System.out.println(prod);
        for(int i=0;i<arr.length;i++){
            prd[i]=prod/arr[i];
        }
        System.out.println(Arrays.toString(prd));


    }
}
