package org.gfk.oops;


class A{
    int x,y;
    public void sum(int x,int y){
        this.x=x;
        this.y=y;
        System.out.println(x+y);
    }
}
class B extends A{
    public void add(int x,int y){
        sum(x,y);
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        B b=new B();
        b.add(5,5);
    }
}
