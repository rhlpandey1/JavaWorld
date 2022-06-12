package org.javaconceptoftheday.basics;
public class PrimeNumber {
    public static  boolean checkPrime(int n){
        boolean flag=true;
        if(n==0||n==1)
            return false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
                flag=false;
        }
        return flag;
    }
    public static void main(String[] args) {
        System.out.println("is prime? "+checkPrime(479));
    }
}
