package org.gfk.array;

import java.util.Arrays;
import java.util.Scanner;

//e.g.- int[] arr={2,0,0,1,3,4,0,1,5,-1,0}
//o/p: {2,1,3,4,1,5,-1,0,0,0,0}
public class MoveAllZerosToTheRight {
    static int[] moveZeroes(int[] arr,int length){
        int count=0;
        for(int i=0;i<length;i++){
            if(arr[i]!=0)
                arr[count++]=arr[i];
            //System.out.println(arr[i]);
        }
       /* while(count<length){
            arr[count++]=0;
        }*/
        for(int i=count;i<length;i++){
            arr[i]=0;
        }
        System.out.println(count);
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(moveZeroes(arr,n)));
    }
}
