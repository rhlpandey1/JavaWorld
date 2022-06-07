package sixt.round1;

public class SumOfConsecutiveNumbersInArray {
    public static void conSum(int[] arr, int n){
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += arr[i] + arr[i + 1];
            System.out.print(sum + " ");
            sum = 0;
        }
        conSum(arr,n);
    }

    public static void main(String[] args) {
        int arr[] = {5, 10, 15, 20, 25};
        conSum(arr,arr.length);

        // output : 5 10 15 20 25

        // 15 25 35 45
        //. 40 60 80
        //. 100 140
        //. 240

        // 5+10 =15 10+15=25. 15+20=35; 20+25=45


        /*int sum = 0;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            sum += arr[i] + arr[i + 1];
            System.out.print(sum + " ");
            sum = 0;
        }*/


    }
}
