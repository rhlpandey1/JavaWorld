package org.gfk.strings;

import java.util.Arrays;

public class StringOperations {
    public static void main(String[] args) {
        String str="Good night";
        //sort
        //without using sort() method
       char[] ch=str.toCharArray();
       char temp;
       for(int i=0;i<ch.length;i++){
        for(int j=i+1;j<ch.length;j++){
            if(ch[i]>ch[j]){
                temp=ch[j];
                ch[j]=ch[i];
                ch[i]=temp;
            }
        }
       }
       //using sort method
        //Arrays.sort(ch);
        System.out.println(ch);
    }
}
