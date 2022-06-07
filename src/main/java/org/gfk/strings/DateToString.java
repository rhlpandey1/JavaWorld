package org.gfk.strings;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateToString {
    public static void main(String[] args) {
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        Date today= Calendar.getInstance().getTime();
        String sDate=sdf.format(today);
        System.out.println(sDate);
        String flag="true";
        boolean b=Boolean.parseBoolean(flag);
        System.out.println(b);

    }
}
