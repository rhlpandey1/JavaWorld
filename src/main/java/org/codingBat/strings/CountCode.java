package org.codingBat.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountCode {
    public static void main(String[] args) {
        String str="aaacoxebbbcodecode";
        String regEx="co[a-z A-Z]e";
        Pattern p=Pattern.compile(regEx);
        Matcher m= p.matcher(str);

        int count=0;
        while(m.find())
            count++;
        System.out.println(count);
       /* System.out.println(str.contains("code"));
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.substring(i,j).matches(regEx))
                    count++;
            }
        }
        System.out.println(count);*/
    }
}
