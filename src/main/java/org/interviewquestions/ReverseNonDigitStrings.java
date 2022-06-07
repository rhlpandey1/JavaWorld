package org.interviewquestions;

import java.util.HashMap;
import java.util.Map;

public class ReverseNonDigitStrings {
    public static String reverseString(String str){
        String str1="";
        for(int i=str.length()-1;i>=0;i--){
            str1+=str.charAt(i);
        }
        return str1;
    }
    public static void main(String[] args) {
        String str="Rahul123Pandey345Deba";
        String regex = "((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))";
        String str1[]=str.split(regex);
        String str2 = "";
        for(String s:str1){
            if(!s.chars().allMatch( Character::isDigit ))
                str2+=reverseString(s);
            else
                str2+=s;
        }
        System.out.println(str2);

        StringBuilder sb=new StringBuilder();
        String st="";
        String str3="";
        int length=str.length();
        for(int i=0;i<length;i++){
            //storing non digits in StringBuilder since we need to reverse
            while((i<length)&&!Character.isDigit(str.charAt(i))){
                sb.append(str.charAt(i));
                i++;
            }
            //storing non digits in another string
            while((i<length)&&Character.isDigit(str.charAt(i))){
                st=st+str.charAt(i);
                i++;
            }
            str3=str3+sb.reverse().append(st);

            st="";
            sb=new StringBuilder();
            i--;
        }
        System.out.println(str3);
    }

}
