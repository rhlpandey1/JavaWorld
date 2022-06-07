package org.gfk.strings;

import java.util.*;

public class PrintUniqueWords {
    public static void printUniqueUsingNestedLoop(String input){
        String[] inputArray=input.split("\\W");
        if(inputArray.length==1)
            System.out.println("The unique word is :->"+inputArray[0]);
        else{
            for(int i=0;i<inputArray.length;i++){
                int count=1;
                {
                    for(int j=i+1;j<inputArray.length;j++){
                        if(inputArray[i].equalsIgnoreCase(inputArray[j])){
                            count+=1;
                            inputArray[j]="";
                        }
                    }
                }
                if(count==1 && inputArray[i]!="")
                 System.out.println(inputArray[i]);
            }
        }

    }
    static void printUniqueUsingMap(String input){
        Map<String,Integer> map=new LinkedHashMap<>();
        String[] inputArray=input.split("\\W");
        if(inputArray.length==1)
            System.out.println("The unique word is :->"+inputArray[0]);
        else{
            for(int i=0;i<inputArray.length;i++){
                if(map.containsKey(inputArray[i])){
                    map.put(inputArray[i],map.get(inputArray[i])+1);
                }
                else
                    map.put(inputArray[i],1);
            }
        }
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()==1)
                System.out.println(entry.getKey());
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your String:");
        String input= scanner.nextLine();
        printUniqueUsingNestedLoop(input);
        System.out.println("*****************");
        printUniqueUsingMap(input);
    }
}
