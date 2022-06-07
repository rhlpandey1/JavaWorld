package org.recursion;

//it will execute until we get stack overflow error
public class RecursionDemo {
    static void recDemo(int n){
        System.out.println(n);
        recDemo(n);
    }

    public static void main(String[] args) {
        recDemo(5);
    }
}
