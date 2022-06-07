package org.sdetqa;

public class RemoveWhiteSpacesFromString {
    public static void main(String[] args) {
        String str=" Rahul P andey ";
        str=str.replaceAll("\\s","");
        System.out.println(str);
    }
}
