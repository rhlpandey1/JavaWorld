package informatica;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RandomShuffleOfArray {
    public static void main(String[] args) {
        Integer[] arr={1,5,2,4,7,8};
        List<Integer> list= Arrays.asList(arr);
        Collections.shuffle(list);
        int[] arr1=list.stream().mapToInt(i->i).toArray();
        System.out.println(Arrays.toString(arr1));
    }
}
