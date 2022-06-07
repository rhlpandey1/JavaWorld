package org.gfk.array;

import java.util.Arrays;

public class SortAnArrayAndInsertAnElement {
    public static void main(String[] args) {
        int array[] = { 10, 8, 7, 6,3,17,12,13,4,9 };
        Arrays.parallelSort(array);
        System.out.println(Arrays.toString(array));
        int array1[]=new int[array.length+1];
        for(int i=0;i<array.length;i++){
                array1[i]=array[i];
        }
        array1[array.length]=18;
        System.out.println(Arrays.toString(array1));

    }
}
