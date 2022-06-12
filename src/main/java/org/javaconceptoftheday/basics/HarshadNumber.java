package org.javaconceptoftheday.basics;

/**
 * Harshad number or niven number is a number which is divisible by the sum of its digits.
 * For example, 21 is a Harshad number because 21 is divisible by the sum
 * of its digits (2+1=3)
 */
public class HarshadNumber {
    public static int sumOfDigits(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        System.out.println("Sum of the digits = "+sum);
        return sum;
    }
    public static boolean checkHarshadNumber(int n){
        boolean flag=false;
        if(n%sumOfDigits(n)==0)
            flag=true;
        return flag;
    }
    public static void main(String[] args) {
        System.out.println("Is Harshad ?"+checkHarshadNumber(21 ));
    }
}
