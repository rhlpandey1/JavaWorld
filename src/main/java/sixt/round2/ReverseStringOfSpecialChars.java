package sixt.round2;

public class ReverseStringOfSpecialChars {
    public static void main(String[] args) {
        String str="R@h#l@&*!";
        /*StringBuilder sb=new StringBuilder(str);
        System.out.println(sb.reverse());*/

        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        System.out.println(rev);
    }
}
