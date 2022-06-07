package org.gfk.strings;

public class RemoveAlternateCharacters {
    public static void main(String[] args) {
        String str="AAABABB";
        int del=0;
        String str2="";
        for(int i=0;i<str.length()-1;i++){
                if(String.valueOf(str.charAt(i)).equals(String.valueOf(str.charAt(i+1))))
                    del++;

        }
        System.out.println(del);
       /* for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(!String.valueOf(str.charAt(i)).equals(String.valueOf(str.charAt(j))))
                    str2+=str2.charAt(i);
            }
        }*/
      //  int count = 0 ;

        String output = "";
        for (int i = 0 ; i < str.length()-1;i++){
            System.out.println("i == " + i);
            int j = i+1;
            while (j< str.length() && str.charAt(i) == str.charAt(j)){
                j++;
            }
            System.out.println("j == " +j);
            output+=str.charAt(i);
            System.out.println(output);
            i = j-1;

        }
      //  System.out.println(output);
        // str=str.replace(String.valueOf(str.charAt(i+1)),"");
    }
}
