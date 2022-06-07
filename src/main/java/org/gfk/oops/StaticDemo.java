package org.gfk.oops;

public class StaticDemo {
    public String name;
    public String address;
    public static String city="Blr";
    public static int i=0;
    public StaticDemo(String name, String address) {
        this.name = name;
        this.address = address;
        i++;
        System.out.println(i);
    }
    public String getAddress(){
        return address;
    }
    public  String getName(){
        return name;
    }
    public static String getCity(){
        return city;
    }

    public static void main(String[] args) {
        StaticDemo staticDemo=new StaticDemo("Rahul","SJP");
        StaticDemo staticDemo1=new StaticDemo("Deba","SJP");
        System.out.println(staticDemo1.getAddress());
        System.out.println(getCity());
    }
}
