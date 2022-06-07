package org.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class StreamMapDemo {
    public static void main(String[] args) {
        Stream.of("Hi","Hello","World","Gold").filter(s->s.endsWith("d")).map(s->s.toUpperCase())
                .forEach(s-> System.out.println(s));
        //sort the stream
        Stream.of("Hi","Hello","World","Gold").sorted().forEach(s-> System.out.println(s));
        //Sort an Integer Array
        List<Integer> il= Arrays.asList(2,5,1,7,9,4);
        int []array=il.stream().sorted(Comparator.reverseOrder()).mapToInt(i->i).toArray();
                //.forEach(s-> System.out.println(s));
        System.out.println(Arrays.toString(array));
        int[] arr = { 5, 4, 2,3,9, 1 };
        arr = Arrays.stream(arr).sorted().toArray();
        System.out.println(Arrays.toString(arr));

        String[] str={"Rahul","Pandey","Deba"};
        List<String> list=Arrays.asList(str);
        list.stream().sorted().forEach(s-> System.out.println(s));

    }
}
