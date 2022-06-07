package org.gfk.array;

import java.util.Scanner;

public class PrintKthElementOfArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=scanner.nextInt();
        System.out.println("Enter the elements :");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        System.out.println("Enter the element to be printed:");
        int k=scanner.nextInt();

        System.out.println(arr[k-1]);
    }
}
