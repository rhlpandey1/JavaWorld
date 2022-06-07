package org.sdetqa;

public class ReverseEachStringInJava {
    public static String rev(String str){
        String str1="";
        for(int i=str.length()-1;i>=0;i--)
            str1+=str.charAt(i);
        return str1;
    }
    public static String rev1(String str){
        StringBuilder sb=new StringBuilder(str);
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String str="Welcome To Java";
        String str2="";
        String[] str1=str.split("\\W");
        for(int i=0;i< str1.length;i++){
            str2=str2+rev1(str1[i])+" ";
        }
        System.out.println(str2);
    }
}
