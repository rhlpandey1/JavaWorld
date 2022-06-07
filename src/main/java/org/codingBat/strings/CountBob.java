package org.codingBat.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountBob {
    public static void main(String[] args) {
        String str="abcb9bbob";
        String regEx="b[a-z A-Z 0-9]b";
        Pattern p=Pattern.compile(regEx);
        Matcher m= p.matcher(str);

        int count=0;
        while(m.find())
            count++;
        System.out.println(count);
    }
}
