package org.javaconceptoftheday.strings;

import java.util.Arrays;

public class PercentageOfUpperLowerAndDigits {
    public static void main(String[] args) {
        String str="RahUlPandeY";
        int lowCount=0;
        int upCount=0;
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i)))
                upCount++;
            else if(Character.isLowerCase(str.charAt(i)))
                lowCount++;
        }
        double lowPercentage=(lowCount/str.length())*100;
        System.out.println("lowPercentage = " + lowPercentage);
    }
}
