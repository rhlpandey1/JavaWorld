package org.gfk.strings;

import java.util.Arrays;
import java.util.Scanner;
/*Input  : String : "[1,2,356,678,3378]"
        Output : Integer array : [1, 2, 356, 678, 3378]*/
public class StringToIntArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
       // String str=sc.next();
        String str="1 2 3 4";
        String []sArr=str.split(" ");
        System.out.println(Arrays.toString(sArr));
        int []arr=new int[sArr.length];
        for(int i=0;i<sArr.length;i++){
            arr[i]=Integer.parseInt(sArr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}
