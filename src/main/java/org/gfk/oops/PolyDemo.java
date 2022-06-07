package org.gfk.oops;
@FunctionalInterface
interface Square {
    int calculate(int x);

    default void print(){
        System.out.println("FunctionalInterface");
    }
}

class A1 {
    int a, b, c;

    public void add(int x, int y)
    {
        a = x;
        b = y;
        System.out.println("addition of a+b is:" + (a + b));
    }

    public void add(int x, int y, int z)
    {
        a = x;
        b = y;
        c = z;
        System.out.println("addition of a+b+c is:" + (a + b + c));
    }

    public void print()
    {
        System.out.println("Class A's method is running");
    }
};

class B1 extends A1 implements Square {
    @Override
    public int calculate(int x) {
        return x*x;
    }

    public void print()
    {
        System.out.println("Class B's method is running");
    }

    // Driver Code
    public static void main(String[] args)
    {
        A1 a1 = new B1();

        // method overloading (Compile-time polymorphism)
        a1.add(6, 5);

        // method overloading (Compile-time polymorphism)
        a1.add(1, 2, 3);

     //   B1 b1 = new B1();

        // Method overriding (Run-time polymorphism)
        a1.print();
        B1 b=new B1();
        System.out.println(b.calculate(5));


// Below two statements are equivalent
        System.out.println(a1);
        System.out.println(a1.toString());



    }
}

