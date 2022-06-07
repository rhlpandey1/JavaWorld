package org.programiz.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapByKeys {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("pos3", "JS");
        languages.put("pos1", "Java");
        languages.put("pos2", "Python");
        System.out.println("Map: " + languages);
        TreeMap<String,String> map=new TreeMap<>(languages);
        System.out.println(map);
    }
}
