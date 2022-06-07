package org.gfk.oops;

public class ThisKeyword {
    int a;
    int b;

    //way 1
   /* public ThisKeyword(int a1, int b1) {
        a = a1;
        b = b1;
    }*/
    //using this keyword
    public ThisKeyword(int a1, int b1) {
        this.a = a;
        this.b = b;
    }
    void disp(){
        System.out.println("a is "+a+" b is"+b);
    }

    public static void main(String[] args) {

        ThisKeyword tk=new ThisKeyword(2,2);
        tk.disp();
    }
}
