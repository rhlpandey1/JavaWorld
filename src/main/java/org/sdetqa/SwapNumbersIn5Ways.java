package org.sdetqa;

public class SwapNumbersIn5Ways {
    public static void main(String[] args) {
        int a=2;
        int b=3;
        System.out.println("a = "+a+" b = "+b);
        //way 1 : using third var
        int t=a;
        a=b;
        b=t;
        System.out.println("a = "+a+" b = "+b);
        //way 2 : without using third var
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a = "+a+" b = "+b);
        //way 3 : multiplication and division
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("a = "+a+" b = "+b);

        //way 4: logical XOR (^)
        a=a^b;//10^11  XOR means if both are diff then it will return 1 i.e. 1 and 0 will return 1
        b=a^b;//
        a=a^b;
        System.out.println("a = "+a+" b = "+b);

        //way 5 : Single statement
        b=a+b-(a=b);
        System.out.println("a = "+a+" b = "+b);

    }
}
