package org.interviewquestions;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n=153;
        int count=0;
        int temp=n;
        while(temp>0){
            temp/=10;
            count++;
        }
        System.out.println(count);

        int rem;
        temp=n;
        int sum=0;

        while(temp>0){
            rem=temp%10;
            sum=sum+(int)Math.pow(rem,count);
            temp=temp/10;
        }
        System.out.println(sum);
        if(sum==n)
            System.out.println("Armstrong");
    }
}
