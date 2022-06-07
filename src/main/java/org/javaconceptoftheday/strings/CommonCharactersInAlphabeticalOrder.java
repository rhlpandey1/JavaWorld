package org.javaconceptoftheday.strings;

import java.util.Set;
import java.util.TreeSet;

public class CommonCharactersInAlphabeticalOrder {
    public static void main(String[] args) {
        String str1="thin sticks";
        char[] ch1=str1.replaceAll("\\s","").toCharArray();
        Set<Character> set1=new TreeSet<>();
        for(char c:ch1)
            set1.add(c);
        String str2="thick bricks";
        char[] ch2=str2.replaceAll("\\s","").toCharArray();
        Set<Character> set2=new TreeSet<>();
        for(char c:ch2)
            set2.add(c);

        set1.retainAll(set2);
        System.out.println(set1);

    }
}
