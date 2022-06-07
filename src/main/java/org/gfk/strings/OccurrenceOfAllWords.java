package org.gfk.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OccurrenceOfAllWords {
    static void getOccurrenceOfWord(String input) {
        String[] words = input.split("\\W");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            Integer count = map.get(word);
            if(count==null)
                map.put(word, 1);
            else{
                count = count + 1;
                map.put(word, count);
            }
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your String:");
        String input = scanner.nextLine();
        getOccurrenceOfWord(input);
    }
}
