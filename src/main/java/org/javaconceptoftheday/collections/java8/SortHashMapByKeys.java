package org.javaconceptoftheday.collections.java8;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class SortHashMapByKeys {
    public static void main(String[] args) {
        Map<Integer,String> map=new LinkedHashMap<>();
        map.put(1,"Rahul");
        map.put(3,"Deba");
        map.put(2,"Subarna"); 
        map.put(4,"Abhi");
        System.out.println("map = " + map);
        /*Map<Integer,String> tMap=new TreeMap<>(map);
        System.out.println("tMap = " + tMap);*/
       //using java 8
        Map<Integer,String> sorted= map.entrySet().stream().sorted(Map.Entry.comparingByKey()).
                collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println("sorted = " + sorted);
        
    }
}
