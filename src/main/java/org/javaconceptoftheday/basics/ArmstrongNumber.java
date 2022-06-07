package org.javaconceptoftheday.basics;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int i=54748;
        int temp=i;
        int temp1=temp;
        //get the number of digits
        int dig=0;
        while(i!=0){
           i=i/10;
           dig++;
        }
        //way 2
        int noOfDigits=String.valueOf(i).length();
        System.out.println(noOfDigits);
        System.out.println(dig);
        int sum=0;
        while(temp!=0){
            int rem=temp%10;
            sum+=Math.pow(rem,dig);
            temp=temp/10;
        }
        if(sum==temp1)
            System.out.println("Armstrong");
        else
            System.out.println("not");
    }
}
