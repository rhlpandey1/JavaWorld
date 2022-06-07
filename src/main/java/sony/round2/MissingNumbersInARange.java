package sony.round2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumbersInARange {
    public static void main(String[] args) {
        int[] arr={2,4,6,7,8,10};
        int n=arr[arr.length-1];
        List<Integer> list= Arrays.asList(2,4,6,7,8,10);
        System.out.print("Missing nos are:-> ");
        for(int i=0;i<n;i++){
            if(!list.contains(i+1))
                System.out.print((i+1)+" , ");
        }
    }
}
