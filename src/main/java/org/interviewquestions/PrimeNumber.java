package org.interviewquestions;

public class PrimeNumber {
    public static void main(String[] args) {
        int num=5;
        int m=num/2;
        boolean flag=true;
        if(num==0||num==1)
            flag=false;
        else{
            for(int i=2;i<=m;i++){
                if(num%i==0){
                    flag=false;
                    break;
                }
            }
        }
        if(flag==true)
            System.out.println("Prime");
    }
}
