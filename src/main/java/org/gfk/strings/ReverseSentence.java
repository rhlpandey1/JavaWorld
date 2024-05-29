package org.gfk.strings

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseSentence {

    public static void main(String[] args) throws Exception {
        //reverse each word and don't change position
        String str="This is Java8 coding practice";
        String result="";
        result=Arrays.stream(str.split(" "))
                .map(word->new StringBuilder(word).reverse().toString())
                        .collect(Collectors.joining(" "));
        System.out.println(result.trim());
    }
}
