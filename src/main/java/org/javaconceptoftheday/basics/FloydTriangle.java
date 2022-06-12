package org.javaconceptoftheday.basics;
public class FloydTriangle {
    public static void printFloyd(int n){
        int count=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(count);
                System.out.print("\t");
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printFloyd(5);
    }
}
