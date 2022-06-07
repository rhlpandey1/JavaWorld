package MorganStanely.round1;

import java.util.Arrays;

public class MinimumSwapToSortAnArray {

    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int indexOf(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key)
                return i;
        }
        return -1;
    }
     static int minimumSwap(int[] arr,int n){
        int count=0;
        int[] temp= Arrays.copyOfRange(arr,0,n);
        Arrays.sort(temp);
        for(int i=0;i<n;i++){
            if(arr[i]!=temp[i]){
                count++;
                swap(arr,i,indexOf(arr,temp[i]));
            }
        }
        return count;
    }
    public static void main(String[] args) {

        int[] a ={ 101, 758, 315, 730, 472,
                619, 460, 479 };
        System.out.println(minimumSwap(a,a.length));
    }
}
