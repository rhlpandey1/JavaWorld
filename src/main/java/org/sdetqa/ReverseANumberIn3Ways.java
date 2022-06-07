package org.sdetqa;

public class ReverseANumberIn3Ways {
    public static void main(String[] args) {
        //way 1
        int a=123;
        int res = 0;
        while(a>0){
            int rem=a%10;
            res=res*10+rem;
            a/=10;
        }
        System.out.println(res);
        //way 2 :StringBuffer class
        a=123;
        StringBuffer sb=new StringBuffer(String.valueOf(a));
        String rev=sb.reverse().toString();
        int revN=Integer.parseInt(rev);
        System.out.println(revN);
        //way 2 :StringBuilder class
        a=123;
        StringBuilder sb1=new StringBuilder(String.valueOf(a));
        String rev1=sb1.reverse().toString();
        int revN1=Integer.parseInt(rev1);
        System.out.println(revN1);

    }
}
