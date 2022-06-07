package org.gfk.strings;

import java.util.Scanner;

/*Count of non-empty substrings is n*(n+1)/2
        If we include empty string also as substring, the count becomes n*(n+1)/2 + 1*/
/*How does above formula work?

        Number of substrings of length one is n (We can choose any of the n characters)
        Number of substrings of length two is n-1 (We can choose any of the n-1 pairs formed by adjacent)
        Number of substrings of length three is n-2
        (We can choose any of the n-2 triplets formed by adjacent)
        In general, number of substrings of length k is n-k+1 where 1 <= k <= n
        Total number of substrings of all lengths from 1 to n =
        n + (n-1) + (n-2) + (n-3) + … 2 + 1
        = n * (n + 1)/2
        */
public class PrintAllPossibleSubstrings {
    static int countSubStringsWithSpecificLength(String input,int length){
        int noOfSubs=0;
        if(length>=1 && length<=input.length())
            noOfSubs= input.length()-length+1;
        return noOfSubs;
    }
    static int countSubStringsOfAnyLength(String input){
        int noOfSubs=0;
        int length=input.length();
        if(length==1)
            noOfSubs=1;
        else
            noOfSubs=length*(length+1)/2;
        return noOfSubs;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your String:");
        String input= scanner.next();
        System.out.println("Do you want substring of specific length?");
        String specificLength=scanner.next();

        if(specificLength.equalsIgnoreCase("Yes")){
            System.out.println("Enter the length of the substring:");
            int length=scanner.nextInt();
            System.out.println("Number of possible Substrings of specific length are "+countSubStringsWithSpecificLength(input,length));
        }
        else
            System.out.println("Number of possible Substrings of any length are "+countSubStringsOfAnyLength(input));

    }
}
