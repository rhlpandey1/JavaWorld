package org.gfk.userinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputBR {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your String");
        String str=bufferedReader.readLine();
        System.out.println("Entered input is "+str);
       // System.out.println("Entered number is "+Integer.parseInt(str));
    }
}
