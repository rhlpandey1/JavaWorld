package org.javaconceptoftheday.strings;

public class RemoveAllVowels {
    public static void main(String[] args) {
        String vowelRegEx="[aeiouAEIOU]";
        String str="Rahul";
        str=str.replaceAll(vowelRegEx,"");
        System.out.println(str);
    }
}
