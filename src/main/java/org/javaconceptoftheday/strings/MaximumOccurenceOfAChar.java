package org.javaconceptoftheday.strings;

import java.util.HashMap;
import java.util.Map;

public class MaximumOccurenceOfAChar {
    public static void main(String[] args) {
        String str="Java Concept Of The Day";
        str=str.replaceAll("\\s","");
        Map<Character,Integer> map=new HashMap<>();
        int max=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(map.containsKey(c)){
                int count=map.get(c);
                count++;
                if(count>max)
                    max=count;
                map.put(c,count);
            }else
                map.put(c,1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()==max)
                System.out.println("The character "+entry.getKey()+" has maximum reps of "+entry.getValue()+" times");
        }
    }
}
