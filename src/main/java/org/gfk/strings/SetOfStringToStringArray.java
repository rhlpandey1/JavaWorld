package org.gfk.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetOfStringToStringArray {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>(Arrays.asList("Hi,hello,world"));
        //using stream
        String[] strArr=set.stream().toArray(String[]::new);
        System.out.println("Using java 8 "+Arrays.toString(strArr));
        //end
        String[] strArr1=new String[set.size()];
        Iterator it=set.iterator();
        int index=0;
        while(it.hasNext())
            strArr1[index++]=it.next().toString();
        System.out.println(Arrays.toString(strArr1));

    }
}
