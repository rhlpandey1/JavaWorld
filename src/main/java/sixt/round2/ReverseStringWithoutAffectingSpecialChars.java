package sixt.round2;

public class ReverseStringWithoutAffectingSpecialChars {
    public static void main(String[] args) {
        String str="Ab,c,de!$";
        char[] ch=str.toCharArray();
        int r=ch.length-1;
        int l=0;

        while(l<r){

            if(!Character.isAlphabetic(ch[l]))
                l++;
            else if(!Character.isAlphabetic(ch[r]))
                r--;
            else{
                char temp=ch[l];
                ch[l]=ch[r];
                ch[r]=temp;
                l++;
                r--;
            }
            
        }
        String rev=new String(ch);
        System.out.println(rev);
    }
}
