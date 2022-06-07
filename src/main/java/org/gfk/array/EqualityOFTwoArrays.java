package org.gfk.array;

import java.util.Arrays;

public class EqualityOFTwoArrays {
    public static void main(String[] args) {
        int arr1[] = { 1, 3, 4,5};
        int arr2[] ={ 1, 3, 4, 5};
        System.out.println(Arrays.equals(arr1,arr2));
        int l1=arr1.length;
        int l2=arr2.length;
        boolean flag=true;
        if(l1!=l2)
            System.out.println("Arrays are not equal");
        else{
            for(int i=0;i<arr1.length;i++){
                if(arr1[i]!=arr2[i])
                    flag=false;
            }
            if(flag==true)
                System.out.println("Arrays are equal");
            else
                System.out.println("Arrays are not equal");
        }
        System.out.println(Arrays.compare(arr1,arr2));
    }

}
