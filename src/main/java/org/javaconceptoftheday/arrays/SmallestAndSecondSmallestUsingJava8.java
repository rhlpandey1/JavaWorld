package org.javaconceptoftheday.arrays;

import java.util.Arrays;

public class SmallestAndSecondSmallestUsingJava8 {
    public static void main(String[] args) {
        int[] arr= {17, 11, 23, 64, 41, 88, 35};
        /*Arrays.sort(arr);
        System.out.println(arr[0]+" "+arr[1]);*/
        //using java 8
        Arrays.stream(arr).sorted().limit(2).forEach(System.out::println);
    }
}
