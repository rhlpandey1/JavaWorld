package org.gfk.strings;

import java.util.Scanner;

/* Input:5 7 4 3 2 6

        Output: 5

        Explanation: There are 6 toy numbers out of which one is the length hence we print 5.

        Input: 10 14 11 15

        Output: -1

        Explanation: There are 4 toy numbers but we do not have 3 as the value in the array hence we print -1.*/
public class FindTheLostNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();
        String[] str1=str.split(" ");
        int count=str1.length-1;
        int count1=0;
        for(int i=0;i<count;i++){
            if(Integer.parseInt(str1[i])==count)
                count1++;
        }
        if(count1==1)
            System.out.println("The count of toy is present as  "+count);
        else
            System.out.println(-1);

    }
}
