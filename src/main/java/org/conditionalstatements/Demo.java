package org.conditionalstatements;

public class Demo {
    public static void main(String[] args) {
       int n=5;
       for(int i=n;i>=1;i--){
         for(int j=n;j>i;j--){
             System.out.print(" ");
         }
         for(int j=0;j<i;j++){
             System.out.print("*");
         }
           System.out.println();
       }
    }
}
