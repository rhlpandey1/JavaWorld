package sixt.round1;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfOccurenceOfALetter {
    public static void main(String[] args) {
        Map<Character,Integer> map=new HashMap<>();
        String str="HelllooooJaaavaa";
        int max=0;
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                int count=map.get(str.charAt(i));
                count++;
                if(count>max)
                    max++;
                map.put(str.charAt(i),count);
            }else{
                map.put(str.charAt(i),1);
            }
        }
        //Integer max=map.get(0);
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            char key= entry.getKey();
            int value=entry.getValue();
            if(map.get(key)==max)
               System.out.println("Key "+key+" repeats "+value+" times");
        }
    }
}
