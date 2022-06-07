package org.gfk.array;

import java.util.Arrays;
import java.util.List;

public class CheckIfValueIsPresentOrNot {

    public static void main(String[] args) {
        int array[] = { 10, 8, 7, 6,3,17,12,13,4,9 };
        int key=10;
        Arrays.sort(array);
        System.out.println(Arrays.binarySearch(array,key));
        boolean flag=false;
       /* for(int i=0;i<array.length;i++){
            if(array[i]==key)
                flag=true;
        }
        if(flag==true)
            System.out.println("value is present");
        else
            System.out.println("Value is not present");*/

        //using stream
        flag= Arrays.stream(array).anyMatch(s->s==key);
        System.out.println("Presence of value "+flag);
    }
}
