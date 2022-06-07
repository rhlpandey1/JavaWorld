package org.sdetqa;

public class CountOccurrenceOfAChar {
    public static void main(String[] args) {
        String str="HelloWorld";
        char c='l';
        char[] ch=str.toCharArray();
        int count=0;
        for(char c1:ch){
            if(c1==c)
                count++;
        }
        System.out.println("Count of the character "+c+" is "+count);

        int length=str.length();
        int length1=str.replaceAll(""+c,"").length();
        System.out.println("Count "+(length-length1));
    }
}
