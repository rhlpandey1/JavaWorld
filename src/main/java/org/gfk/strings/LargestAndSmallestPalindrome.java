package org.gfk.strings;

public class LargestAndSmallestPalindrome {
    static boolean checkPalindrome(String str){
        String str1="";
        for(int i=str.length()-1;i>=0;i--){
            str1+=str.charAt(i);
        }
        if(str1.equalsIgnoreCase(str))
            return true;
        else
            return false;
    }
    static void checkLength(String input){
        String str[]=input.split("\\W");
        int min=str[0].length();
        int max=str[0].length();
        String smallest="";
        String largest="";
        if(str.length==1)
            smallest=largest=str[0];
        else{
            for(String ip:str){
                if(checkPalindrome(ip)==true){
                    if(ip.length()<=min){
                        min=ip.length();
                        smallest=ip;
                    }
                    if(ip.length()>=max){
                        max=ip.length();
                        largest=ip;
                    }
                }
            }
        }

        System.out.println("Smallest Palindrome is :->"+smallest);

        System.out.println("Largest Palindrome is :->"+largest);
    }
    public static void main(String[] args) {
        checkLength("Nitin is a good guy");
    }
}
