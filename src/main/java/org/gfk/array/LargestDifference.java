package org.gfk.array;

public class LargestDifference {
    public static void main(String[] args) {
        int[] arr1={1,2,5,4,3,3,2,89,234,123};
        int diff=arr1[1]-arr1[0];
        int a = 0,b=0;
        for(int i=0;i< arr1.length;i++){
            for(int j=i+1;j<arr1.length;j++){
                if(Math.abs(arr1[j]-arr1[i])>diff){
                    diff=Math.abs(arr1[j]-arr1[i]);
                    a=arr1[i];
                    b=arr1[j];
                }
            }
        }
        System.out.println("Elements are "+a+" and"+b);

    }
}
