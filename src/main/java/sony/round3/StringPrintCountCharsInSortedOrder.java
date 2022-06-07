package sony.round3;


import java.util.*;

public class StringPrintCountCharsInSortedOrder {
    public static void main(String[] args) {
        String str="my name is Rahul Pandey and i live in Banglore";
        Map<Character,Integer> map=new HashMap<>();
        str=str.replaceAll("\\s","");
        char[] ch=new char[str.length()];
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(map.containsKey(c)){
                int count=map.get(c);
                map.put(c,++count);
            }
            else
                map.put(c,1);
        }
        int count=0;
        //sort as per the values
        List<Map.Entry<Character,Integer>> list=new LinkedList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        Map<Character, Integer> temp = new LinkedHashMap<>();
        for (Map.Entry<Character, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        //end sort
        for(Map.Entry<Character,Integer> entry:temp.entrySet()){
            for(int i=0;i< entry.getValue();i++)
                ch[count++]= entry.getKey();
        }
        //  Arrays.sort(ch);
        //aaaaannnnneeeeiiii

        System.out.println(new String(ch));
    }
}