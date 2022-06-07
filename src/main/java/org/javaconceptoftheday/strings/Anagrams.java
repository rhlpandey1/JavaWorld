package org.javaconceptoftheday.strings;

import java.util.*;

public class Anagrams {
    public static void main(String[] args) {
        String str1="Mother In Law";
        String str2="Hitler Woman";
        //way 1
      /*  boolean flag ;
        char[] ch1=str1.toLowerCase().replaceAll("\\s","").trim().toCharArray();
        Arrays.sort(ch1);
        char[] ch2=str2.toLowerCase().replaceAll("\\s","").trim().toCharArray();
        Arrays.sort(ch2);
        if(ch1.length!=ch2.length)
            flag=false;
        else if(Arrays.equals(ch1,ch2))
            flag=true;
        else
            flag=false;

        System.out.println("is anagram? "+flag);*/

        //way 2
        /*Set<Character> set1=new TreeSet<>();
        Set<Character> set2=new TreeSet<>();
        for(char c:str1.toLowerCase().replaceAll("\\s","").toCharArray())
            set1.add(c);
        for(char c:str2.toLowerCase().replaceAll("\\s","").toCharArray())
            set2.add(c);
        System.out.println(set1.equals(set2));*/

        //way 3
        boolean flag=true;
        str1=str1.replaceAll("\\s","").toLowerCase(Locale.ROOT);
        str2=str2.replaceAll("\\s","").toLowerCase(Locale.ROOT);
        if(str1.length()!=str2.length())
            flag=false;
        else{
            Map<Character,Integer> map=new HashMap<>();
            for(int i=0;i<str1.length();i++){
                char c=str1.charAt(i);
                int count=0;
                if(map.containsKey(c))
                {
                    count=map.get(c);
                   // count++;
                }
                map.put(c,++count);
                c=str2.charAt(i);
                count=0;
                if(map.containsKey(c)){
                    count=map.get(c);
                   // count--;
                }
                map.put(c,--count);
            }
            for(int val:map.values()){
                if(val!=0)
                    flag=false;

            }

        }
        System.out.println("is anagram? "+flag);
    }
}
