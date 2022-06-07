package org.gfk.array;

import java.util.Arrays;
import java.util.List;

public class IntegerListToIntegerArray {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4);
        System.out.println(Arrays.toString(list.toArray()));
        int[] arr=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        System.out.println(Arrays.toString(arr));
        //way 2
        int[] arr1=list.stream().mapToInt(i->i).toArray();
        System.out.println("Using stream");
        System.out.println(Arrays.toString(arr1));
    }
}
