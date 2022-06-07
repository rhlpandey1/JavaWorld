package org.javaconceptoftheday.basics;

public class CheckBinaryNumber {
    public static void main(String[] args) {
        int num=101101;
        boolean flag=true;
        while(num!=0){
            int rem=num%10;
            if(rem!=1 && rem!=0)
            {
               flag=false;
               break;
            }
            else
                num/=10;
        }
        System.out.println("Is binary? "+flag);
    }
}
