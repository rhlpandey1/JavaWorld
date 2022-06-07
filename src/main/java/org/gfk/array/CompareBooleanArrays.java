package org.gfk.array;

import java.util.Arrays;

public class CompareBooleanArrays {
    public static void main(String[] args) {
        boolean[] A = {true , true , false};
        boolean[] A1 = {true, true, false};
        System.out.println(Arrays.equals(A,A1));
        for(int i=0;i<A.length;i++){
            if(A[i]!=A1[i])
            {
                System.out.println("Arrays are not equal");
                System.exit(0);
            }
        }
        System.out.println("Arrays are equal");
    }
}
