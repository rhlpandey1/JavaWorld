package org.javaconceptoftheday.arrays;

import java.util.Arrays;

public class EqualityOfArrays {
    public static void main(String[] args) {
        int []arr1={1,2,3,4};
        int arr2[]={4,3,2,1};
        Arrays.sort(arr2);
        int len1=arr1.length;
        int len2=arr2.length;
        boolean flag = false;
        if(len1!=len2)
            flag=false;
        else{
          //  flag=Arrays.equals(arr1,arr2);
            for(int i=0;i<len1;i++){
                for(int j=0;j<len2;j++){
                    if(arr1[i]!=arr2[j])
                        flag=false;
                    else
                        flag=true;

                }
            }
        }

        System.out.println(flag);
    }
}
