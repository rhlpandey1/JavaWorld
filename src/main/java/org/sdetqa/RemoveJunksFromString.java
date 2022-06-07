package org.sdetqa;

public class RemoveJunksFromString {
    public static void main(String[] args) {
        String str="Rahul@123#";
        String regEx="[^A-Za-z0-9]";
        str=str.replaceAll(regEx,"");
        System.out.println(str);
    }
}
