package org.javaconceptoftheday.strings;
public class ReverseStringByPreservingTheSpaces {
    public static void main(String[] args) {
        String str="I am String";
        int n=str.length();
        char[] ch=str.toCharArray();
        char[] result=new char[n];
        for(int i=0;i<n;i++){
            if(ch[i]==' ')
                result[i]=ch[i];
        }
        int count=0;
        for(int i=n-1;i>=0;i--){
            if(ch[i]!=' '){
               if(result[count]==' '){
                   count++;
               }
                result[count]=ch[i];
                count++;
            }

        }
        System.out.println(new String(result));
    }
}
