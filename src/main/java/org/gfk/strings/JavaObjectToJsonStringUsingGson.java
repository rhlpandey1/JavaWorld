package org.gfk.strings;

import com.google.gson.Gson;
import org.gfk.pojos.Employees;

public class JavaObjectToJsonStringUsingGson {
    public static void main(String[] args) {
        Employees emp=new Employees();
        System.out.println(new Gson().toJson(getEmpData(emp)));

    }
    public static Employees getEmpData(Employees emp){
        emp.setEmpCode(560098);
        emp.setEmployeeName("Rahul");
        emp.setOrgName("Rakuten");

        return emp;
    }
}
