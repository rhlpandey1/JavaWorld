package org.sdetqa;

import javax.sound.midi.Soundbank;
import java.io.*;
import java.util.Scanner;

public class ReadTextFile {
    public static void main(String[] args) throws IOException {
        File file=new File("fileread.txt");
        file.createNewFile();
        FileReader fr=new FileReader(file);
        BufferedReader reader=new BufferedReader(fr);
        String str;
        StringBuffer sb=new StringBuffer();
        while((str=reader.readLine())!=null){
            System.out.println(str);
            sb.append(str);
            sb.append("\n");
        }
        reader.close();
        fr.close();
        System.out.println("_____________________________");
        System.out.println(sb);
        System.out.println("_____________________________");
        //way 2 Scanner
        Scanner sc=new Scanner(file);
        while(sc.hasNextLine())
            System.out.println(sc.nextLine());
        sc.close();
    }
}
