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
        System.out.println(primeCheck(4));

    }
}
