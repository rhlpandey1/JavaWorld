package org.programiz.collections;

import java.util.*;

public class SortMapByValues {
    public static void main(String[] args) {
        LinkedHashMap<String, String> capitals = new LinkedHashMap();
        capitals.put("Nepal", "Kathmandu");
        capitals.put("India", "New Delhi");
        capitals.put("United States", "Washington");
        capitals.put("England", "London");
        capitals.put("Australia", "Canberra");

        List<Map.Entry<String,String>> caps=new ArrayList<>(capitals.entrySet());
        Collections.sort(caps, Comparator.comparing(Map.Entry::getValue));
        Map<String,String> map=new LinkedHashMap<>();

        for(Map.Entry<String,String> entry:caps){
            map.put(entry.getKey(), entry.getValue());
        }
        System.out.println(map);
    }
}
