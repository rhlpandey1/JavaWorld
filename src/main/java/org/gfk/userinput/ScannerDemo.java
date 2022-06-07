package org.gfk.userinput;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input ");
        String str=scanner.next();
        System.out.println("Output "+str);

    }
}
