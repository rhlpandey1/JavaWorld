package org.javaconceptoftheday.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringRotationValidation {
    public static void checkRotation(String str1,String str2){
        if(str1.length()!=str2.length())
            return;
        else{
            String str3=str1+str1;
            if(str3.contains(str2))
                System.out.println("Rotated");
            else
                System.out.println("not rotated");
        }
    }
    public static void main(String[] args) {
        String str="JavaJ2eeStrutsHibernate";
        String rotated="StrutsHibernateJavaJ2ee";
        checkRotation(str,rotated);
    }
}
