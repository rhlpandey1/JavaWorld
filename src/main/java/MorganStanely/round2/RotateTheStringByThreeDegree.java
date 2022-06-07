package MorganStanely.round2;

import java.util.LinkedList;
import java.util.List;

public class RotateTheStringByThreeDegree {
    public static void main(String[] args) {
        String str="AB";
        //ulRah
        //hulRa

      /*  int n1=3;
        int n2=str.length()-n1;
        List<Character> l1=new LinkedList<>();
        List<Character> l2=new LinkedList<>();
        for(int i=0;i<n2;i++)
            l1.add(str.charAt(i));
        for(int j=n2;j<str.length();j++)
            l2.add(str.charAt(j));

        l2.addAll(l1);
        System.out.println(l2);
        String op="";
        for(char c:l2)
            op+=c;
        System.out.println(op);*/

        char[] ch=str.toCharArray();
        int n=str.length();
        for(int i=0;i<3;i++){

            char temp=ch[n-1];
            for(int j=n-1;j>0;j--){
                ch[j]=ch[j-1];
            }
            ch[0]=temp;
        }

        System.out.println(new String(ch));


    }

}
