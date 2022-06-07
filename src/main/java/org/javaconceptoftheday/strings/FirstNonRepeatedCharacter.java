package org.javaconceptoftheday.strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str="geeksforgeeks";
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(map.containsKey(c)){
                int count=map.get(c);
                count++;
                map.put(c,count);
            }
            else
                map.put(c,1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                System.out.println("First non repeated character is "+entry.getKey());
                break;
            }
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
           if (entry.getValue()>1){
                System.out.println("First  repeated character is "+entry.getKey());
                break;
            }
        }
    }
}
