package org.gfk.strings;

import java.util.Locale;

public class ReverseAParticularSubstringInEntireString {
    //hTis is hte htread htat given
    public static String reverseString(String str){
        String str1="";
        for(int i=str.length()-1;i>=0;i--){
            str1+=str.charAt(i);
        }
        return str1;
    }
    public static void main(String[] args) {
        String str="This is The Thread That given";
        String str1="Th";
        String str2 = "";
        str2 = str.replaceAll(str1, reverseString(str1));
        String str3 = str2.replaceAll(str1.toLowerCase(Locale.ROOT), reverseString(str1.toLowerCase(Locale.ROOT)));
        System.out.println(str3);
    }
}
