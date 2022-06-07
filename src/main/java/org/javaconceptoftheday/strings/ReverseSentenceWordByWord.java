package org.javaconceptoftheday.strings;

public class ReverseSentenceWordByWord {
    public static void main(String[] args) {
        String str="Java Language Of The Day";
        String[] str1=str.split("\\W");
        StringBuffer sb=new StringBuffer();
        /*for(int i=str1.length-1;i>=0;i--){
            sb.append(str1[i]).append(" ");
        }
        System.out.println(sb);*/

        //word by word reverse
        StringBuilder sb1= new StringBuilder();
        String str2 = "";
        for(int i=str1.length-1;i>=0;i--){
            str2+=new StringBuilder(str1[i]).reverse().append(" ");
        }
        System.out.println(str2);
    }
}
