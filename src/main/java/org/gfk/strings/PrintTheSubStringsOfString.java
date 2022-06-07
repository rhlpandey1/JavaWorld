package org.gfk.strings;

import java.util.Scanner;

public class PrintTheSubStringsOfString {
    static void printSubStrings(String str){
        int length=str.length();
        int noOfSubStrings=length*(length+1)/2;
        System.out.println("Number of SubStrings are "+noOfSubStrings);
        for(int i=0;i<str.length();i++){
           for (int j=i+1;j<=str.length();j++){
               System.out.println("The SubString is "+str+"("+i+","+j+") :->"+str.substring(i,j));
           }
        }
    }
    static void printSubStringsOfSpecificLength(String str,int size){
        int length=str.length();
        int noOfSubStrings=length-size+1;
        System.out.println("Number of SubStrings of size "+size+" are: "+noOfSubStrings);
        for(int i=0;i<str.length();i++){
            for (int j=i+1;j<=str.length();j++){
                if(str.substring(i,j).length()==size)
                    System.out.println("The SubString is "+str+"("+i+","+j+") :->"+str.substring(i,j));
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your String:");
        String input= scanner.next();
        printSubStrings(input);
        System.out.println("************************");
        printSubStringsOfSpecificLength(input,2);
    }
}
