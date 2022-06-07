package org.sdetqa;

public class CountWordsInAString {
    public static void main(String[] args) {
        String str="Hi Hello Rahul Hi World Hi";
        String key="Hi";
        String str1[]=str.split("\\W");
        int count=0;
        for(int i=0;i<str1.length;i++){
            if(str1[i].equalsIgnoreCase(key))
                count++;
        }
        System.out.println(count);
    }
}
