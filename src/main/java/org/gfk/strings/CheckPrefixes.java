package org.gfk.strings;

public class CheckPrefixes {
    public static void main(String[] args) {
        String[] prefixes = {"Feeks", "for", "Ffor"};
        String str="GeeksforGeeks";
        boolean flag=false;
        for(int i=0;i<prefixes.length;i++){
            if(str.startsWith(prefixes[i]))
                flag=true;
        }
        if(flag==true)
            System.out.println("String contains prefix");
        else
            System.out.println("String doesn't contains prefix");
    }
}
