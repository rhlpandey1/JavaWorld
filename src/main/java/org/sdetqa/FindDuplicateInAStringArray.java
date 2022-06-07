package org.sdetqa;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateInAStringArray {
    public static void main(String[] args) {
        String[] str={"Hello","Java","Java"};
        Set<String> set=new HashSet<>();
        boolean flag=false;
        for(String s:str){
            if(set.add(s)==false){
                System.out.println("Duplicate element is "+s);
                flag=true;
            }
        }
        if(flag==false)
            System.out.println("No duplicate found");
    }
}
