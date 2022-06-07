package org.gfk.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveOneArrayFromAnotherArray {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6,7,8};
       //  List<int[]> list1=Arrays.asList(arr);
        // Arrays.asList(1,2,4,5,6,7,8);

        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        int[] arr1={1,2,7};
       // List<int[]> list2=Arrays.asList(arr1);
        List<Integer> list2=new ArrayList<>();
        list2.add(2);
        list1.removeAll(list2);

        System.out.println(list1);
    }
}
