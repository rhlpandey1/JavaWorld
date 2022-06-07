package org.gfk.strings;

public class RemoveLeadingZeroes {
    public static void main(String[] args) {
        String str="00000123569";
        int count=0;
        StringBuffer sb=new StringBuffer(str);
        for(int i=0;i<sb.length();i++){
            count++;
            if(sb.charAt(i)!='0')
                break;
        }
        sb.replace(0,count-1,"");
        System.out.println(sb);
    }
}
