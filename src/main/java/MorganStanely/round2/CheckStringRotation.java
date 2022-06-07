package MorganStanely.round2;

public class CheckStringRotation {
    public static void main(String[] args) {
        String str="ABCDE";
        String str1="CDABE";
        System.out.println(str);
        str=str+str;
        if(str.contains(str1))
            System.out.println("rotated");
        else
            System.out.println("not rotated");


    }
}
