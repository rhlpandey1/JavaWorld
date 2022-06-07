package vmware;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Arrays;

public class Test2 {

    public Student setDetails(boolean flag){
       // boolean flag=false;
        Address address=new Address();
        address.setPostalCode(347657343);
        address.setLandmark("adhgasfdg");
        Student student=new Student();
        student.setFirstName("Rahul");
        student.setId(354);
        if(flag==true)
            student.setAddress(address);
        return student;
    }

    public static void main(String[] args) {
        boolean flag=false;
        Address address=new Address();
        address.setPostalCode(347657343);
        address.setLandmark("adhgasfdg");
        Student student=new Student();
        student.setFirstName("Rahul");
        student.setId(354);
        if(flag==true)
            student.setAddress(address);

        Gson gson=new GsonBuilder().serializeNulls().create();
        String payload= gson.toJson(student);
        System.out.println(payload);


    }





}
