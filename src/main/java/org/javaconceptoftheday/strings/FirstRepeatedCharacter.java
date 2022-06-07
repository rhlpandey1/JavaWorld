package org.javaconceptoftheday.strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class FirstRepeatedCharacter {
    public static void main(String[] args) {
        String str="rahulpandey";
        Set<Character> set=new LinkedHashSet<>();
        for(char c:str.toCharArray()){
            if(set.contains(c))
            {
                System.out.println("First repeated character is "+c);
                break;
            }
            else
                set.add(c);
        }
    }

}
