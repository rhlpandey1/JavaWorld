package org.conditionalstatements;

public class StarPattern {

    //scenario : 1
    // *
    // * *
    // * * *

    public static void printTriangle(int n){
        for(int i=0;i<=n;i++){
            for (int j=0;j<i;j++){
                System.out.print("*");
                System.out.print("\t");
            }
            System.out.println();
        }
    }
    //scenario : 2
    // * * *
    // * *
    // *

    public static void printInvertedTriangle(int n){
        for(int i=0;i<=n;i++){
            for (int j=n;j>i;j--){
                System.out.print("*");
                System.out.print("\t");
            }
            System.out.println();
        }
    }
    //scenario : 3
    //      *
    //    * *
    //  * * *
    //* * * *

    public static void printLeftTriangle(int n){
        for(int i=0;i<n;i++){
            for (int j=2*(n-i);j>=0;j--){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    //scenario : 4
    //     *
    //    * *
    //   * * *
    //  * * * *

    public static void printPyramid(int n){
        for(int i=0;i<n;i++){
            for (int j=(n-i);j>=0;j--){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    //scenario : 5
    //   * * * *
    //    * * *
    //     * *
    //      *

    public static void printInvertedPyramid(int n){
        for(int i=0;i<n;i++){
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
            for (int j=n;j>i;j--){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    //Scenario 6
    // *
    // * *
    // * * *
    // * * *
    // * *
    // *
    public static void printPascalsTriangle(int n){
        for(int i=0;i<=n;i++){
            for (int j=0;j<i;j++){
                System.out.print("*");
                System.out.print("\t");
            }
            System.out.println();
        }
        for(int i=1;i<n;i++){
            for (int j=n;j>i;j--){
                System.out.print("*");
                System.out.print("\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
       // printTriangle(3);
       // printInvertedTriangle(3);
       // printLeftTriangle(4);
       // printPyramid(4);
       // printInvertedPyramid(4);
        printPascalsTriangle(4);
    }
}
