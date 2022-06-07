package org.gfk.strings;

import java.util.Scanner;

public class StringConversions {
    static String flot2String(float f){
        return String.valueOf(f);
    }
    static String short2String(short s){
        return String.valueOf(s);
    }
    static String double2String(double s){
        return String.valueOf(s);
    }
    static float string2Float(String f){
        return Float.parseFloat(f);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your float value:");
        float f=scanner.nextFloat();
        System.out.println(flot2String(f));
        System.out.println("Enter your short value:");
        short s=scanner.nextShort();
        System.out.println(short2String(s));
        System.out.println("Enter your double value:");
        double d=scanner.nextDouble();
        System.out.println(double2String(d));
        System.out.println("Enter your string value:");
        String str=scanner.next();
        System.out.println(string2Float(str));
    }
}
