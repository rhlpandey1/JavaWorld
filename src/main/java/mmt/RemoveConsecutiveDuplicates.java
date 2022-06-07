package mmt;

import java.util.*;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        String str="jjjjjaaaavaaa";
        char[] ch=str.toCharArray();
        int j=0;
       for(int i=1;i<ch.length;i++){
            if(ch[j]!=ch[i]){
                j++;
                ch[j]=ch[i];
            }
       }
       char []ch1=new char[j+1];
        System.arraycopy(ch, 0, ch1, 0, j + 1);
        System.out.println(new String(ch1));
        System.out.println(Arrays.copyOfRange(ch, 0, j + 1));
    }
}
