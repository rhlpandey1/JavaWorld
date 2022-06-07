package org.sdetqa;

import java.io.*;
import java.util.Scanner;

public class WriteToTextFile {
    public static void main(String[] args) throws IOException {
        File file=new File("fileWrite.txt");
        file.createNewFile();
        FileWriter fw=new FileWriter(file);
        PrintWriter writer=new PrintWriter(fw);
        writer.write("Hello Java \n");
        writer.write("Rahul");
        System.out.println("Writing done");
        writer.flush();
        writer.close();
    }
}
