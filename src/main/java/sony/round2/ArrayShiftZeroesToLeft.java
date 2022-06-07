package sony.round2;

import java.util.Arrays;

public class ArrayShiftZeroesToLeft {
    public static void main(String[] args) {

        int [] arr= {0,2,0,7,0,0,4,0,3,8,0};

        int[] arr1=new int[arr.length];

        int count=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
                arr1[count++]=0;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));

        for(int i=0;i<arr.length;i++){

            if(arr[i]!=0)
               arr1[count++]=arr[i];
        }

        System.out.println(Arrays.toString(arr1));
    }
}
