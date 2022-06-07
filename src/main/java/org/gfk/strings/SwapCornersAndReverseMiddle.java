package org.gfk.strings;

public class SwapCornersAndReverseMiddle {
    public static void main(String[] args) {
        String str="Hello World GFG Welcomes You";
        String[] str1=str.split("\\W");
        String s1=str1[0];
        String s2=str1[str1.length-1];
        str=str.replace(s1,"").replace(s2,"");
        String str2="";
        for(int i=str.length()-1;i>=0;i--)
            str2+=str.charAt(i);

        System.out.println(s2+str2+s1);
    }
}
