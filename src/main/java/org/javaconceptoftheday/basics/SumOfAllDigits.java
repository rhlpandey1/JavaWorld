package org.javaconceptoftheday.basics;

public class SumOfAllDigits {
    public static void main(String[] args) {
        int i=54748;
        int sum=0;
        while(i!=0){
            int rem=i%10;
            sum+=rem;
            i/=10;
        }
        System.out.println(sum);
    }
}
