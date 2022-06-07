package sixt.round3;

import java.io.IOException;

public class SortEachWordsOfAString {
    public static void bubbleSort(char[] arr){
            int n = arr.length;
            for (int i = 0; i < n - 1; i++)//i -> 0,1,2,3,4,5
                for (int j = 0; j < n - i - 1; j++)//j->0-5,0-4,0-3,0-2,0-1
                    if (arr[j] > arr[j + 1]) {
                        // swap arr[j+1] and arr[j]
                        char temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
        }

    public static void insertionSort(char arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            char key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    static void selectionSort(char arr[])
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            char temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) throws IOException {
        String str="Rahul7 Hell8o Worl7d";
        String[] str1=str.split("\\W");
        String str2="";
        for(int i=0;i<str1.length;i++){
            char[] ch=str1[i].toCharArray();
           // Arrays.sort(ch);
            SortEachWordsOfAString.bubbleSort(ch);
            System.out.println(new String(ch));
        }

    }
}
