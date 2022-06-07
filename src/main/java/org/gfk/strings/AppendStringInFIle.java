package org.gfk.strings;

import java.io.*;
import java.util.Scanner;

public class AppendStringInFIle {
    static FileWriter writer = null;
    static void writeToFile(String filePath,String input){
        try{
            writer=new FileWriter(filePath);
            writer.write(input);
        }catch (IOException i){
            i.printStackTrace();
        }
        finally {
            try {
                writer.flush();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    static void readFromFile(String filePath){
        try {
          BufferedReader br=new BufferedReader(new FileReader(filePath));
          String st;
            while ((st = br.readLine()) != null)
                System.out.println(st);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }
    public static void main(String[] args) throws IOException {
        String filePath="str.txt";
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your input:");
        String input=scanner.nextLine();
        writeToFile(filePath,input);
        readFromFile(filePath);

    }
}
