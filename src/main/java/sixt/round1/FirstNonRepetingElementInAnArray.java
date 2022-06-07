package sixt.round1;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepetingElementInAnArray {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,4,5,3,4,4,4,3};
        //LHM is taken to maintain the insertion order
        Map<Integer,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int count=map.get(arr[i]);
                count++;
                map.put(arr[i],count);
            }else
            {
                map.put(arr[i],1);
            }
        }
        System.out.println(map);
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                System.out.println("First no rep is "+entry.getKey());
                break;
            }
        }
    }
}
