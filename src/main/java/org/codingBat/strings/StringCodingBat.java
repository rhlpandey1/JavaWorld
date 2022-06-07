package org.codingBat.strings;

public class StringCodingBat {
    public static void main(String[] args) {
        String str="helloworldd";
        //5->1st and last 7-> first 2 and last 2 9->first 3 and last 3
        //5-3
        System.out.println(str.length());
        int start=(str.length()-3)/2;
        str=str.substring(start,start+3);
        System.out.println(str);

        str="Hello";
        String sub=str.substring(str.length()-3);
        String str2="";
        for(int i=0;i<3;i++){
            str2+=sub;
        }
        System.out.println(str2);
    }
}
