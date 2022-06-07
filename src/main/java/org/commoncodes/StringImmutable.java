package org.commoncodes;

public class StringImmutable {
    public static void main(String[] args) {
        String str="Rahul";
        str.concat("Pandey");
        System.out.println(str);
        str=str.concat(" Pandey");
        System.out.println(str);

    }
}
