package sony.round1;

import java.util.HashMap;
import java.util.Map;

public class CountOfLetters {
    //Input: aaabbcccdd
    //
    //
    //
    //Output: a3b2c3d2

    public static void main(String[] args) {
        String str="aaabbcccdd";
        Map<Character,Integer> map=new HashMap<>();

        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
               int count=map.get(str.charAt(i));
               map.put(str.charAt(i),++count);
            }
            else
                map.put(str.charAt(i),1);
        }

        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            System.out.print(entry.getKey()+""+entry.getValue());
        }

    }
}
