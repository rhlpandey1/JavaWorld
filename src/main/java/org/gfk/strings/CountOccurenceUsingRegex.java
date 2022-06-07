package org.gfk.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountOccurenceUsingRegex {
    public static void main(String[] args) {
        String str="HelloEngineerseee";
        char ch='e';
        String regex=String.valueOf(ch);
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(str);
        int count=0;
        while(m.find()){
           count++;
        }
        System.out.println(count);
    }
}
