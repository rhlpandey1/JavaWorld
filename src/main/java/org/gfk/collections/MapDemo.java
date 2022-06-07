package org.gfk.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> hm1
                = new LinkedHashMap<>();

        // Inserting pairs in above Map
        // using put() method
        hm1.put("a", 100);
        hm1.put("b",200);
        hm1.put("c",200);
        hm1.put("d",200);
        hm1.put("e",null);

        System.out.println(hm1);
        for(Map.Entry<String,Integer> entry:hm1.entrySet())
        {
            System.out.println("Key ="+entry.getKey()+" Value= "+entry.getValue());
        }
        Map<String, Integer> hm2 = new TreeMap<>();

        // Inserting pairs in above Map
        // using put() method
        hm2.put("e",600);
        hm2.put("a",100);
        hm2.put("b",200);
        hm2.put("c",500);
        hm2.put("d",300);


        System.out.println(hm2);
        for(Map.Entry<String,Integer> entry:hm2.entrySet())
        {
            System.out.println("Key ="+entry.getKey()+" Value= "+entry.getValue());
        }
        Map<String, Integer> hm
                = new LinkedHashMap<>();

        // Inserting pairs in above Map
        // using put() method
        hm.put("a", 100);
        hm.put("b",200);
        for(Map.Entry<String,Integer> entry:hm.entrySet())
        {
            if(entry.getKey().equals("a"))
                System.out.println(entry.getValue());
        }
    }
}
