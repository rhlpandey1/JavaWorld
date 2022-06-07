package org.gfk.array;

public class PrintOddPositionElements {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,7,89,2};
        for(int i=0;i<arr.length;i+=2){
            System.out.println(arr[i]);
        }
    }
}
