package org.javaconceptoftheday.collections.java8;

import java.util.*;
import java.util.stream.Collectors;

public class SortHashMapByValues {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"A");
        map.put(3,"B");
        map.put(4,"C");
        map.put(2,"D");
        map.put(7,"E");
        //way 1
        /*Map<Integer,String> tMap=new TreeMap<>(map);
        System.out.println(tMap);*/

        List<Map.Entry<Integer,String>> list=new ArrayList<>(map.entrySet());

        //way 2 (java 8)
       // Collections.sort(list, Comparator.comparing(Map.Entry::getKey));
        //way 3
   /*     Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });*/
        //way 4(java 8)
       // Collections.sort(list, (o1, o2) -> o2.getKey().compareTo(o1.getKey()));

        //way 5
       Map<Integer,String> sortedMap=map.entrySet().stream().
               sorted(Map.Entry.comparingByKey((o1, o2) -> o1-o2))
               .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e2,LinkedHashMap::new));
        System.out.println(sortedMap);
    }
}
