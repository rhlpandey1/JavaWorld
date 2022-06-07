package sixt.round3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CountOfWordFromFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new FileReader("demo.txt"));
        Map<String,Integer> map=new HashMap<>();
        String st;
        while((st=reader.readLine())!=null){
            String[] str=st.split("\\W");
            for(int i=0;i<str.length;i++){
                if(map.containsKey(str[i])){
                    int count=map.get(str[i]);
                    count++;
                    map.put(str[i],count);
                }
                else{
                    map.put(str[i],1);
                }
            }
        }
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println("The word "+entry.getKey()+" is present "+entry.getValue() +" times");
        }

    }
}
