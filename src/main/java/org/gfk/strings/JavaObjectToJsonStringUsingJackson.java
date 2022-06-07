package org.gfk.strings;

import org.gfk.pojos.Employees;
public class JavaObjectToJsonStringUsingJackson {
    public static void main(String[] args) {
        Employees emp=new Employees();
       /* ObjectMapper Obj = new ObjectMapper();

        try {

            // get Organisation object as a json string
            String jsonStr = Obj.writeValueAsString(getEmpData(emp));

            // Displaying JSON String
            System.out.println(jsonStr);
        }

        catch (IOException e) {
            e.printStackTrace();
        }*/
    }
    public static Employees getEmpData(Employees emp){
        emp.setEmpCode(560098);
        emp.setEmployeeName("Rahul");
        emp.setOrgName("Rakuten");

        return emp;
    }
}
