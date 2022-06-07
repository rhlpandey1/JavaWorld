package org.conditionalstatements;

public class NumberPattern {
    //scenario 1
    //1
    //1 2
    //1 2 3

    public static void printTriangleNumberPattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
    //scenario 1
    //1
    //2 3
    //4 5 6

    public static void printTriangleWithIncrementalNumberPattern(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num);
                System.out.print("\t");
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       // printTriangleNumberPattern(4);
        printTriangleWithIncrementalNumberPattern(4);
    }
}
