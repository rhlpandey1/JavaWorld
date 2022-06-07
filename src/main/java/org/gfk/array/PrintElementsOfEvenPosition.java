package org.gfk.array;

public class PrintElementsOfEvenPosition {
    public static void main(String[] args) {
        int[] arr1={1,2,5,4,3,3,2,89,234,123};
        for(int i=1;i<=arr1.length;i++){
            if(i%2==0){
                System.out.println(arr1[i-1]);
            }
        }
    }
}
