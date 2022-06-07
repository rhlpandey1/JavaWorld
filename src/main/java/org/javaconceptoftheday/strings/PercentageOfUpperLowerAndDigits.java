package org.javaconceptoftheday.strings;

import java.text.DecimalFormat;
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
        double lowPercentage=(lowCount*100.0/str.length());
        DecimalFormat formatter = new DecimalFormat("##.##");
        System.out.println("lowPercentage = " +formatter.format(lowPercentage));
    }
}
