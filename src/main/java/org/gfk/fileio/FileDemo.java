package org.gfk.fileio;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileDemo {
    public static void main(String[] args) throws IOException {
       /* String fName = "str1.txt";
        File f=new File(fName);
        f.createNewFile();
        FileOutputStream fos=new FileOutputStream("str2.txt");
        System.out.println("File name "+f.getName());
        System.out.println("File path "+f.getPath());
        System.out.println("File abs path "+f.getAbsolutePath());
        System.out.println("can exc "+f.canExecute());
        System.out.println(f.canRead());
        System.out.println(f.canWrite());*/

        /*String text="Welcome to file";
        Path p=Path.of("str2.txt");
        Files.writeString(p,text);
        String content=Files.readString(p);
        System.out.println(content);*/

        /*FileWriter fw=new FileWriter("str2.txt");
        fw.write("FileWriter Demo");
        fw.close();*/

        /*BufferedWriter bw=new BufferedWriter(new FileWriter("str2.txt"));
        bw.write("BufferedWriter demo");
        bw.flush();
        bw.write("BufferedWriter demo1");
        bw.close();*/

        /*File f=new File("str.txt");
        if(f.delete())
            System.out.println("deleted");
        else
            System.out.println("file is not present");*/

        BufferedReader br=new BufferedReader(new FileReader("str2.txt"));
        String st;
        while((st=br.readLine())!=null)
            System.out.println(st);
    }
}
