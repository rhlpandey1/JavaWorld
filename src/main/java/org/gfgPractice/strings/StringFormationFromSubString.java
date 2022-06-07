package org.gfgPractice.strings;

public class StringFormationFromSubString {
    static String formString(String sub,int strLen,int subLen){
        String str = "";

            int n=strLen/subLen;
            for(int i=0;i<n;i++){
                str+=sub;
            }
        
        return str;
    }
    static  int isRepeat(String s) {
        // code here
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                String form=formString(s.substring(i,j),s.length(),s.substring(i,j).length());
                if(form!=null){
                    if(form.equals(s))
                    return 1;
                }

            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String s = "bluiabluiabluia";
        System.out.println(isRepeat(s));
    }
}
