package org.javaconceptoftheday.basics;

/**
 * Pronic number is a number which is the product of two consecutive integers i.e n(n+1)
 */
public class PronicNumber {
    public static void checkPronic(int n){
        int num=(int)Math.sqrt(n);
        if(num*(num+1)==n)
            System.out.println("Pronic number");
        else
            System.out.println("Non pronic");
    }
    public static void main(String[] args) {
        checkPronic(72);
    }
}
