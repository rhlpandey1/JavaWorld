package org.commoncodes;

public class PrimeNumberCheck {
    public static boolean primeCheck(int num){
        boolean flag = true;
        if(num==0|| num==1)
            return false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(primeCheck(n));
        //using java 8
         boolean isPrime= IntStream.rangeClosed(2,n/2).noneMatch(i->n%i==0);

    }
}
