package org.gfk.strings;

public class LengthOfAStringWithoutUsingLengthMethod {
    public static void main(String[] args) {
        String str="RahulPandey";
        char ch[]=str.toCharArray();
        int len=0;
        for(char c:ch)
            len++;

        System.out.println(len);
    }
}
