package org.javaconceptoftheday.basics;

public class DecimalToBinaryConverter {
    public static int decToBin(int dec){
        StringBuffer sb=new StringBuffer();
        while(dec!=0){
            int rem=dec%2;
            sb.append(rem);
            dec/=2;
        }
        return Integer.parseInt(sb.reverse().toString());
    }
    public static int decToOct(int dec){
        StringBuffer sb=new StringBuffer();
        while(dec!=0){
            int rem=dec%8;
            sb.append(rem);
            dec/=8;
        }
        return Integer.parseInt(sb.reverse().toString());
    }
    public static int decToHex(int dec){
        StringBuffer sb=new StringBuffer();
        while(dec!=0){
            int rem=dec%16;
            sb.append(rem);
            dec/=16;
        }
        return Integer.parseInt(sb.reverse().toString());
    }
    public static void main(String[] args) {
        int dec=10;
        System.out.println(decToBin(dec));
        System.out.println(decToOct(dec));
        System.out.println(decToHex(dec));
    }
}
