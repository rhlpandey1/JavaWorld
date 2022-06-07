package org.gfk.strings;

public class RemoveNonAlphabeticCharacters {
    public static void main(String[] args) {
        String str="Hello, how are you ?";
        String[] str1=str.trim().split("\\W");
        for(String s:str1)
            System.out.println(s);
        for(int i=0;i<str.length();i++){
            if(!String.valueOf(str.charAt(i)).matches("^[a-zA-Z]*$"))
                str=str.replace(String.valueOf(str.charAt(i)),"");
        }
        System.out.println(str);
    }
}
