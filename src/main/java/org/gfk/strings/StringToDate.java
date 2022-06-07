package org.gfk.strings;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {
    public static void main(String[] args) throws ParseException {
        String date="11/01/2021";
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        Date d=sdf.parse(date);
        System.out.println(d);
        String str="2.32";
        Double d1=Double.parseDouble(str);
        Double d2=Double.valueOf(str);
        System.out.println(d1+d2);
    }
}
