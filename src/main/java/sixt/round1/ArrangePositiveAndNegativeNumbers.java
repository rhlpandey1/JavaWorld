package sixt.round1;

import java.util.Arrays;

public class ArrangePositiveAndNegativeNumbers {
    public static void swap(int[] a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void main(String[] args) {
        int arr[] = { 12, 11, -13, -5, 6, -7, 5, -3, -6 ,8,9};
        /*Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));*/
        int p=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                swap(arr,i,p);
                p++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
