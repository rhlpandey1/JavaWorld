import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class PairsWithSum {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7,8,9};
        int sum=10;

        /*for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum)
                    System.out.println("indices are "+i+" and "+j);
            }
        }*/
        //optimized method
        Map<Integer,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                System.out.println("pair is "+i+" and "+map.get(arr[i]));
            }
            map.put(sum-arr[i],i);
        }

    }
}
