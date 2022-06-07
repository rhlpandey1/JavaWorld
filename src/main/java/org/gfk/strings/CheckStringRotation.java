package org.gfk.strings;

public class CheckStringRotation {
    public static void main(String[] args) {
        String str1="AACD";
        String str2="ACDA";
        if((str1+str1).contains(str2))
            System.out.println("s2 is a rotation of s1");
    }
}
