package org.gfk.strings;

public class SwapWithoutUsingThird {
    public static void main(String[] args) {
        //String swap
        String str1="Rahul";
        String str2="Pandey";
        System.out.println("******* Before Swap ********");
        System.out.println("str2 is :->"+str2);
        System.out.println("str1 is :->"+str1);
        System.out.println("******* After Swap ********");
        str1=str1+str2;
        //RahulPandey
        str2=str1.substring(0,str2.length()-1);
        System.out.println("str2 is :->"+str2);
        str1=str1.substring(str2.length());
        System.out.println("str1 is :->"+str1);
        //Integer swap
        int i=3;
        int j=2;
        System.out.println("******* Before Swap ********");
        System.out.println("i is :->"+i);
        System.out.println("j is :->"+j);
        i=i+j;
        j=i-j;
        i=i-j;
        System.out.println("******* after Swap ********");
        System.out.println("i is :->"+i);
        System.out.println("j is :->"+j);
    }
}
