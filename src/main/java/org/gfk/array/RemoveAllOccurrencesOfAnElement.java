package org.gfk.array;

import java.util.*;

public class RemoveAllOccurrencesOfAnElement {
    public static void main(String[] args) {
        int array[] = {13, 11, 45, 32, 89, 21,11,334,11 };
        int key=11;
        List<Integer> list=new ArrayList<>();
        int index=0;
        for(int i=0;i<array.length;i++){

            if (array[i]!=key){
                array[index++]=array[i];
                list.add(array[i]);
            }

        }
        array=list.stream().mapToInt(i->i).toArray();
        System.out.println(Arrays.toString(Arrays.copyOf(array,index)));
        System.out.println(Arrays.toString(array));
    }
}
