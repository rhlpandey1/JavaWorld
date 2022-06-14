package org.gfgPractice.arrays;

import java.util.ArrayList;

/**
 * Input:
 * N = 5, S = 12
 * A[] = {1,2,3,7,5}
 * Output: 2 4
 * Explanation: The sum of elements
 * from 2nd position to 4th position
 * is 12.
 */
public class SubArrayWithGivenSum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here
        int start = 0;
        int last;
        boolean flag=false;
        int sum=0;
        ArrayList<Integer> res = new ArrayList<Integer>();

        //iterating over the array.
        for(int i=0;i<n;i++)
        {
            //storing sum upto current element.
            sum+= arr[i];

            //checking if current sum is greater than or equal to given number.
            if(sum>=s)
            {
                last=i;
                //we start from starting index till current index and do the
                //excluding part while s(given number) < sum.
                while(s<sum && start<last)
                {
                    //subtracting the element from left i.e., arr[start]
                    sum-= arr[start];
                    ++start;
                }

                //now if current sum becomes equal to given number, we store
                //the starting and ending index for the subarray.
                if(sum==s)
                {
                    res.add(start + 1);
                    res.add(last + 1);

                    //flag is set to true since subarray exists.
                    flag = true;
                    break;
                }
            }
        }
        //if no subarray is found, we store -1 in result else the found indexes.
        if (flag==false) {
            res.add(-1);
        }
        //returning the result.
        return res;
    }
    public static void main(String[] args) {
       int  S = 12;
       int A[] = {1,2,3,7,5};
        System.out.println(subarraySum(A,A.length,S));
    }
}
