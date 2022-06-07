package org.javaconceptoftheday;

import java.util.HashMap;
import java.util.Map;

public class Practice {
    public static  String revStr(String str){
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
       // String str="Rahu l Pandey";
       /* System.out.println(revStr(str));
        StringBuilder sb=new StringBuilder(str);
        System.out.println(sb.reverse());*/
      //  System.out.println(str.replaceAll("\\s",""));
        String str="Better Butter";
        int[] arr={1,3,4,1,2,7,2};
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
                if(map.containsKey(arr[i])){
                    int count=map.get(arr[i]);
                    count++;
                    map.put(arr[i],count);
                }
                else{
                    map.put(arr[i],1);
                }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>1)
                System.out.println("The character "+entry.getKey()+" repeated "+entry.getValue()+" times");
        }
    }
}
