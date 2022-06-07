package org.gfk.array;

import java.util.Arrays;
import java.util.Scanner;

public class SecondHighestElementInAnArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size ");
        int length=sc.nextInt();
        int arr[]=new int[length];
        System.out.println("Enter the array digits :");
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("the array "+Arrays.toString(arr));
        System.out.println("max "+max);
        System.out.println("Second highest "+arr[1]);

        //using stream
        int arr1[]=Arrays.stream(arr).sorted().toArray();
        System.out.println("Using stream "+Arrays.toString(arr1));
        System.out.println("Second Highest Using stream "+arr1[arr1.length-2]);
    }
}
