package org.javaconceptoftheday.strings;
public class PrintAllSubStrings {
    public static void main(String[] args) {
        String str="Rahul";
        for(int i=0;i<=str.length();i++){
            for(int j=i+1;j<=str.length();j++)
            {
                System.out.println(str.substring(i,j));
            }
        }
    }
}
