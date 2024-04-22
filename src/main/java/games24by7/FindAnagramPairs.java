package games24by7;

import java.util.*;

public class FindAnagramPairs {
    public static void anagramPairs(String[] str){
        Map<String,List<String>> map=new HashMap<>();
        List<String> words;
        for (String value : str) {
            char[] ch = value.toCharArray();
            Arrays.sort(ch);
            String word = new String(ch);

            if (map.containsKey(word)) {
                words = map.get(word);
                words.add(value);
            } else {
                words = new ArrayList<>();
                words.add(value);
                map.put(word, words);
            }

        }
        for (String s : map.keySet()) {
            List<String> values = map.get(s);
                System.out.print(values);
        }
        //another way of iterating map
       for(Map.Entry<String,List<String>> entry: map.entrySet()){
            System.out.println(entry.getValue());
        }
    }
    public static void main(String[] args) {
        String []arr =  { "cat", "dog", "tac", "god", "act" };
       anagramPairs(arr);
    }
}
