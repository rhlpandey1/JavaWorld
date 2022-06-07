package sixt.round2;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,4,5,7,9};
        int key=4;
        
        int low=0;
        int high=arr.length-1;
        int index = 0;
        boolean flag=false;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==key){
                index=mid;
                flag=true;
                break;
            }
            else if(arr[mid]>key){
                high=mid-1;
            }
            else if(arr[mid]<key)
                low=mid+1;
        }
        if(flag==true)
            System.out.println("The element "+key+" found at index "+index);
    }
}
