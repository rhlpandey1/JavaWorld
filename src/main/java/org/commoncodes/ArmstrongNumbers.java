package org.commoncodes;
public class ArmstrongNumbers {
    private static boolean isArmStrong(int n){
        int res=0;
        boolean flag=false;
        int temp=n;
        while(n!=0){
            int rem=n%10;
            res+=Math.pow(rem,3);
            n/=10;
        }
        if(res==temp)
             flag=true;
        return flag;
    }
    private static boolean isArmStrongUsingJava8(int n){
        int len=String.valueOf(n).length();
        int sum=String.valueOf(n).chars().map(ch->Character.digit(ch,10))
                .map(digit->(int)Math.pow(digit,len)).sum();
        return sum==n;
    }
    public static void main(String[] args) throws Exception {
        //Armstrong numbers : sum of 3 to the power of all the digits should be same as the number
        System.out.println(isArmStrong(111));
    }
}
