package org.gfk.strings;

import java.util.*;

public class ListOfIntegerToListOfString {
    public static void main(String[] args) {
        List<Integer> iList= Arrays.asList(1,2,3,4);
        List<String> sList=new ArrayList<>();
        for(int i:iList){
            sList.add(String.valueOf(i));
        }
        System.out.println(sList);
        //Set of String to set of Integer
        Set<String> sSet= new HashSet<>(Arrays.asList("1","2","3"));
        Set<Integer> iSet=new HashSet<>();
        Iterator it=sSet.iterator();
        while(it.hasNext()){
            iSet.add(Integer.parseInt(it.next().toString()));
        }
        System.out.println(iSet);
    }
}
