package org.gfk.fileio;

import java.io.*;

public class CountOfAWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("str1.txt"));
        String str;
        int count=0;
        while((str=br.readLine())!=null){
            if(str.contains("Rahul"))
                count++;
        }
        System.out.println("Count of the specific word "+count);
    }
}
