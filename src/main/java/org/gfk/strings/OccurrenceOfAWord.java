package org.gfk.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OccurrenceOfAWord {
    static void getOccurrenceOfWord(String input, String word){
        String[] str=input.split("\\W");
        Map<String,Integer> map=new HashMap<>();
        for(String ip:str){
                if (map.containsKey(word) && ip.equals(word)) {
                    int count = map.get(word);
                    count = count + 1;
                    map.put(word, count);
                }

            else {
                map.put(ip, 1);
            }
        }
        System.out.println("Count of "+word+" is :->"+map.get(word));
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your String:");
        String input= scanner.nextLine();
        System.out.println("Enter the word :");
        String word=scanner.next();
        getOccurrenceOfWord(input,word);
    }
}
