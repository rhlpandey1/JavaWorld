package org.sdetqa;

public class EvenAndOddDigitCount {

    public static void main(String[] args) {

        int n=123344567;
        int ec=0;
        int oc=0;
        while(n>0){
            int rem=n%10;
            if(rem%2==0)
                ec++;
            else
                oc++;
            n/=10;
        }
        System.out.println("Even count is "+ec+" Odd count is "+oc);

    }
}
