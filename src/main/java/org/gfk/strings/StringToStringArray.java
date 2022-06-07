package org.gfk.strings;

import java.util.StringTokenizer;

public class StringToStringArray {
    public static void main(String[] args) {
        String str="Geeks for Geeks";
        //Using Split
        String str1[]=str.split(" ");
        System.out.print("[");
        for (int i=0;i<str1.length;i++)
        {
            System.out.print(str1[i]+",");
        }
        System.out.println("]");
        //Using tokenizer
        StringTokenizer st=new StringTokenizer(str," ");
        System.out.print("[");
        while (st.hasMoreTokens())
        {
            System.out.print(st.nextToken()+",");
        }
        System.out.print("]");
    }
}
