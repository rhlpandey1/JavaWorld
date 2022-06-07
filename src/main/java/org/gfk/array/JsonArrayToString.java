package org.gfk.array;

import com.google.gson.JsonArray;

import java.util.ArrayList;
import java.util.List;

public class JsonArrayToString {
    public static void main(String[] args) {
        JsonArray jsonArray=new JsonArray();
        jsonArray.add("Rahul");
        jsonArray.add("Pandey");
        System.out.println(jsonArray);
        List<String> list=new ArrayList<>();
        for(int i=0;i<jsonArray.size();i++)
            list.add(jsonArray.get(i).toString());

        for(String str:list)
            System.out.println(str);



    }
}
