package org.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeArrayLists {
    public static void main(String[] args) {
        List<Integer> il= Arrays.asList(1,4,7);
        List<Integer> il1= Arrays.asList(2,4,8,12);
      //  Stream<Integer> newS=Stream.concat(il.stream(),il1.stream());
        List<Integer> il3=Stream.concat(il.stream(),il1.stream()).sorted().toList();
        System.out.println(il3);
    }
}
