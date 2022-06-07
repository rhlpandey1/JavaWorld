package org.gfk.strings;

import java.util.HashMap;
import java.util.Map;

public class NoOfWordsVowelsAndFrequency {
    public static void main(String[] args) {
        String str="How Good GOD Is.";
        String str2=str.intern();
        System.out.println(str==str2);
        int noOfWords=str.split("\\W").length;
        System.out.println(noOfWords);
        String vowelRegEX="[AEIOUaeiou]";
        int vc=0;
        int uc=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch))
                uc++;
            if(String.valueOf(ch).matches(vowelRegEX))
                vc++;

            if(map.containsKey(ch)){
                int count = map.get(ch);
                count++;
                map.put(ch,count);
            }
            else
                map.put(ch,1);
        }
        System.out.println("No of uppercase characters are :->"+uc+" No of vowels are :->"+vc);
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            System.out.println("Character: "+entry.getKey()+" frequency: "+entry.getValue());
        }
    }
}
