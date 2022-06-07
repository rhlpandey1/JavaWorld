package org.gfgPractice.arrays;

public class MaximumArrayIndexDifference {
    static int maxIndexDiff(int A[], int N) {
        int max=0;
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                if(A[i]<=A[j]){
                    int diff=j-i;
                    max=Math.max(max,diff);
                }
            }
        }
        return max;
    }
        public static void main(String[] args) {
           int A[] = {82, 63, 44, 74, 82, 99, 82};
            int N = A.length;
            System.out.println(maxIndexDiff(A,N));
    }
}
