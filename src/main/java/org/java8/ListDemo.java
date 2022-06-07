package org.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListDemo {

    public static void main(String[] args) {
        List<String> list= Arrays.asList("Hi","Hello","World");
        int c=0;
        for(String str:list){
            if(str.startsWith("H"))
                c++;
        }
        System.out.println(c);
        long c1=list.stream().filter(s->s.startsWith("H")).count();
        System.out.println(c1);
        //without creating array list- stream api
        long d1=Stream.of("Hi","Hello","World").filter(s->
        {
             s.startsWith("W");
             return true;
        }).count();
        System.out.println(d1);
        Stream.of("Hi","Hello","World").forEach(s-> System.out.println(s));
        System.out.println("****************");
        Stream.of("Hi","Hello","World").filter(s->s.length()>3).forEach(s-> System.out.println(s));
        System.out.println("****************");
        Stream.of("Hi","Hello","World").filter(s->s.length()>3).limit(1).forEach(s-> System.out.println(s));
        System.out.println("****************");
        List<Integer> number=Arrays.asList(1,2,5,6,3);
        List square=number.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println("square "+square);
        System.out.println("****************");
        List<String> sList=Arrays.asList("School","College","Stream");
        List<String> st=sList.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
        System.out.println(st);
        st=sList.stream().sorted().collect(Collectors.toList());
        System.out.println(st);
        st.forEach(s-> System.out.println(s));
    }

}
