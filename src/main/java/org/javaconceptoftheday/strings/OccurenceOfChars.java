package org.javaconceptoftheday.strings;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfChars {
    public static void main(String[] args) {
        String str="Java J2EE Java JSP J2EE";
        Map<Character,Integer> map=new HashMap<>();
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
        for (Map.Entry<Character,Integer> entry:map.entrySet()){
            System.out.println("Count of char "+entry.getKey()+" is "+entry.getValue());
        }
    }
}
