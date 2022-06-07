package org.gfk.strings;


import java.lang.*;
import java.util.Scanner;
//Given a string str of some specific length, the task is to pad this string with the given character ch, inorder to make the string of length L.
/*Input: str = “Geeksforgeeks”, ch =’-‘, L = 20
        Output:
        Left Padding: ————GeeksForGeeks
        Center Padding: ——GeeksForGeeks——
        Right Padding: GeeksForGeeks————*/
public class AddPadding {
    static void addPadding(String str,int len,char ch){
        int paddingLength=len-str.length();
        int lrPadding=paddingLength/2;
        String str1="";
        String str2="";
        for(int i=0;i<lrPadding;i++){
            str1+=ch;
        }
        for(int i=0;i<paddingLength;i++){
            str2+=ch;
        }
        System.out.println("Left Padding "+str2+str);
        System.out.println("Center Padding "+str1+str+str1);
        System.out.println("Right Padding "+str+str2);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your String:");
        String input= scanner.next();
        System.out.println("Enter the length:");
        int len= scanner.nextInt();
        System.out.println("Enter the padding char:");
        char ch= scanner.next().charAt(0);
        addPadding(input,len,ch);
    }
}
