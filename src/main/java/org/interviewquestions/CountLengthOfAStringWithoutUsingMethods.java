package org.interviewquestions;

public class CountLengthOfAStringWithoutUsingMethods {
    public static void main(String[] args) {
        String str="Rahul";
        char[] ch=str.toCharArray();
        int len=0;
        for(char c:ch)
            len++;
        System.out.println(len);
    }
}
